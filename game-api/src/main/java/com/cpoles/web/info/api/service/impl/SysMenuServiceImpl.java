package com.cpoles.web.info.api.service.impl;

import com.cpoles.framework.jpa.service.BusinessService;
import com.cpoles.web.info.api.domain.entity.SysMenu;
import com.cpoles.web.info.api.domain.entity.SysUser;
import com.cpoles.web.info.api.repository.SysMenuRepository;
import com.cpoles.web.info.api.service.SysCacheService;
import com.cpoles.web.info.api.service.SysMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl extends BusinessService implements SysMenuService {

    private final SysCacheService sysCacheService;
    private final SysMenuRepository sysMenuRepository;

    public SysMenuServiceImpl(SysCacheService sysCacheService,
                              SysMenuRepository sysMenuRepository) {
        this.sysCacheService = sysCacheService;
        this.sysMenuRepository = sysMenuRepository;
    }

    public List<SysMenu> getSysMenusByAppId(String appId, String token) {

        SysUser sysUser = this.sysCacheService.getLoginUser(token);
        if (sysUser.getAdminFlag()) {
            return sysMenuRepository.findByAppIdAndEnabled(appId, true);
        } else {
            return sysMenuRepository.findByAppIdAndEnabledAndChecked(appId, true, false);
        }
    }
}
