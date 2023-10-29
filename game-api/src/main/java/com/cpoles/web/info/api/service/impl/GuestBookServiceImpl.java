package com.cpoles.web.info.api.service.impl;

import com.cpoles.framework.jpa.service.BusinessService;
import com.cpoles.web.info.api.domain.dto.GuestBookCriteria;
import com.cpoles.web.info.api.domain.entity.CodeWeb;
import com.cpoles.web.info.api.domain.entity.GuestBook;
import com.cpoles.web.info.api.repository.CodeWebRepository;
import com.cpoles.web.info.api.repository.GuestBookRepository;
import com.cpoles.web.info.api.service.GuestBookService;
import com.cpoles.web.info.api.service.SysCacheService;
import com.cpoles.web.info.api.utility.EmailUtil;
import com.cpoles.web.info.api.utility.RegexUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GuestBookServiceImpl extends BusinessService implements GuestBookService {

    private final SysCacheService sysCacheService;
    private final CodeWebRepository codeWebRepository;
    private final GuestBookRepository guestBookRepository;

    @Autowired
    public GuestBookServiceImpl(SysCacheService sysCacheService,
                                CodeWebRepository codeWebRepository,
                                GuestBookRepository guestBookRepository) {
        this.sysCacheService = sysCacheService;
        this.codeWebRepository = codeWebRepository;
        this.guestBookRepository = guestBookRepository;
    }

    @Override
    public Page<GuestBook> indexData(GuestBookCriteria criteria) {

        List<Sort.Order> orders = new ArrayList<>();
        orders.add(new Sort.Order(Sort.Direction.DESC, "createdDt"));

        PageRequest pageRequest = PageRequest.of(
            criteria.getPage(),
            criteria.getSize(),
            Sort.by(orders));

        return this.pageByFreeFilter(GuestBook.class, criteria.buildFilters(), pageRequest);
    }

    @Override
    public void addData(GuestBook data, String ipAddress) {
        //检查
        String validMessage = data.valid();
        if (!StringUtils.isEmpty(validMessage)) throw new RuntimeException(validMessage);

        LocalDateTime createdDt = LocalDateTime.now().minusMinutes(1);
        if (this.guestBookRepository.existsByIpAddressAndCreatedDtAfter(ipAddress, createdDt))
            throw new RuntimeException("请不要频繁发送信息!");

        //保存
        data.setIpAddress(ipAddress);
        data.setResponseStatus("N");
        data.setResponseBy("");
        data.setResponseDt(LocalDateTime.now());
        data.audit("VISITOR");
        this.guestBookRepository.save(data);

        //发送邮件通知
        sendMessage(data);
    }

    private void sendMessage(GuestBook data) {
        try {
            Optional<CodeWeb> optionalCodeWeb = this.codeWebRepository.findFirstByCode(data.getWeb());
            if (!optionalCodeWeb.isPresent()) return;

            String toAddress = optionalCodeWeb.get().getEmail();
            if (StringUtils.isEmpty(toAddress) || !RegexUtil.isEmail(toAddress)) return;

            String title = String.format("来自%s的网站留言", data.getName());
            String body = "姓名:" + data.getName() + System.lineSeparator() +
                "手机号码:" + data.getMobile() + System.lineSeparator() +
                "电子邮箱:" + data.getEmail() + System.lineSeparator() +
                "公司名称:" + data.getContent() + System.lineSeparator() +
                "业务类型:" + data.getBusinessType() + System.lineSeparator() +
                "需求描述:" + data.getContent() + System.lineSeparator();
            EmailUtil.sendEmail(toAddress, title, body);

        } catch (Exception ignored) {
        }
    }

    @Override
    public GuestBook responseData(GuestBook data, String token) {

        if (StringUtils.isEmpty(data.getResponseRemark())) throw new RuntimeException("请输入处理意见!");
        if (!sysCacheService.exists(token)) throw new RuntimeException("权限限制");

        String userName = sysCacheService.getLoginUserName(token);
        data.setResponseStatus("Y");
        data.setResponseBy(userName);
        data.setResponseDt(LocalDateTime.now());
        data.audit(userName);
        return this.guestBookRepository.saveAndFlush(data);
    }

    @Override
    public void deleteData(String id, String token) {

        if (!sysCacheService.exists(token)) throw new RuntimeException("权限限制");

        this.guestBookRepository.deleteById(id);
    }
}
