package com.cpoles.web.info.api.service.impl;

import com.cpoles.framework.jpa.service.BusinessService;
import com.cpoles.web.info.api.domain.entity.SysOrg;
import com.cpoles.web.info.api.domain.entity.SysUser;
import com.cpoles.web.info.api.repository.SysOrgRepository;
import com.cpoles.web.info.api.service.SysCacheService;
import com.cpoles.web.info.api.service.SysOrgService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@SuppressWarnings("Duplicates")
@Service
public class SysOrgServiceImpl extends BusinessService implements SysOrgService {

    private final SysCacheService sysCacheService;
    private final SysOrgRepository sysOrgRepository;

    public SysOrgServiceImpl(SysCacheService sysCacheService,
                             SysOrgRepository sysOrgRepository) {
        this.sysCacheService = sysCacheService;
        this.sysOrgRepository = sysOrgRepository;
    }

    @Override
    public List<SysOrg> indexSysOrg() {
        return this.sysOrgRepository.findAll();
    }

    @Override
    public SysOrg updateSysOrg(SysOrg data, String token) {
        //检查
        SysUser loginUser = this.sysCacheService.getLoginUser(token);
        if (!loginUser.getAdminFlag())
            throw new RuntimeException("权限不足");

        String validMessage = data.valid();
        if (!StringUtils.isEmpty(validMessage)) throw new RuntimeException(validMessage);

        data.audit(loginUser.getName());
        return this.sysOrgRepository.saveAndFlush(data);
    }

    @Override
    public void deleteSysOrg(String id, String token) {
        //检查
        SysUser loginUser = this.sysCacheService.getLoginUser(token);
        if (!loginUser.getAdminFlag())
            throw new RuntimeException("权限不足");

        this.sysOrgRepository.deleteById(id);
    }
}
