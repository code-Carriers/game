package com.cpoles.web.info.api.service.impl;

import com.cpoles.framework.jpa.service.BusinessService;
import com.cpoles.web.info.api.domain.entity.CodeWeb;
import com.cpoles.web.info.api.domain.entity.SysUser;
import com.cpoles.web.info.api.repository.CodeWebRepository;
import com.cpoles.web.info.api.service.CodeWebService;
import com.cpoles.web.info.api.service.SysCacheService;
import com.cpoles.web.info.api.utility.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CodeWebServiceImpl extends BusinessService implements CodeWebService {

    private final SysCacheService sysCacheService;
    private final CodeWebRepository codeWebRepository;

    public CodeWebServiceImpl(SysCacheService sysCacheService,
                              CodeWebRepository codeWebRepository) {
        this.sysCacheService = sysCacheService;
        this.codeWebRepository = codeWebRepository;
    }

    @Override
    public List<CodeWeb> indexData(String keyword) {
        if (StringUtils.isEmpty(keyword)) {
            return this.codeWebRepository.findAllByOrderByCode();
        } else {
            keyword = StringUtil.getSqlLikeParameter(keyword);
            return this.codeWebRepository.findAllByCodeLikeOrNameLikeOrderByCode(keyword, keyword);
        }
    }

    @Override
    public List<CodeWeb> getAuthData(String token) {

        //装载代码
        List<CodeWeb> codeWebs = this.codeWebRepository.findAll();
        codeWebs.sort(Comparator.comparing(CodeWeb::getCode));

        //全部权限
        SysUser sysUser = this.sysCacheService.getLoginUser(token);
        String webAuth = sysUser.getWebAuth().trim();
        if (StringUtils.isEmpty(webAuth) || "*".equals(webAuth))
            return codeWebs;

        //个别权限
        List<CodeWeb> result = new ArrayList<>();
        String[] codes = webAuth.split("\\|");
        for (String code : codes) {
            if (StringUtils.isEmpty(code)) continue;

            List<CodeWeb> tempCodeWebs = codeWebs.stream().filter(p -> code.equals(p.getCode())).collect(Collectors.toList());
            if (tempCodeWebs.size() > 0) result.addAll(tempCodeWebs);
        }
        result.sort(Comparator.comparing(CodeWeb::getCode));

        return result;
    }

    @Override
    public CodeWeb getData(String id) {
        Optional<CodeWeb> optionalNews = this.codeWebRepository.findById(id);
        return optionalNews.orElse(null);
    }

    @Override
    public CodeWeb updateData(CodeWeb data, String token) {
        String validMessage = data.valid();
        if (!StringUtils.isEmpty(validMessage)) throw new RuntimeException(validMessage);

        String userName = sysCacheService.getLoginUserName(token);
        data.audit(userName);

        return this.codeWebRepository.save(data);
    }

    @Override
    public void deleteData(String id) {
        this.codeWebRepository.deleteById(id);
    }
}
