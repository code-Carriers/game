package com.cpoles.web.info.api.service.impl;

import com.cpoles.framework.jpa.service.BusinessService;
import com.cpoles.web.info.api.domain.entity.SysUser;
import com.cpoles.web.info.api.service.SysCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class SysCacheServiceImpl extends BusinessService implements SysCacheService {

    private final Cache tokenCache;

    @Autowired
    public SysCacheServiceImpl(CacheManager cacheManager) {
        this.tokenCache = cacheManager.getCache("tokens");
    }

    public void put(String token, SysUser sysUser) {
        tokenCache.putIfAbsent(token, sysUser);
    }

    public void evict(String token) {
        tokenCache.evict(token);
    }

    public boolean exists(String token) {
        return tokenCache.get(token, SysUser.class) != null;
    }

    public SysUser getLoginUser(String token) {
        return getTokenSysUser(token);
    }

    public String getLoginUserId(String token) {
        if ("SYSTEM".equals(token)) return "SYSTEM";
        return getTokenSysUser(token).getId();
    }

    public String getLoginUserName(String token) {
        if ("SYSTEM".equals(token)) return "SYSTEM";
        return getTokenSysUser(token).getName();
    }

    public String getLoginUserOrgId(String token) {
        return getTokenSysUser(token).getOrgId();
    }

    public String getLoginUserOrgName(String token) {
        return getTokenSysUser(token).getOrgName();
    }

    private SysUser getTokenSysUser(String token) {
        SysUser sysUser = tokenCache.get(token, SysUser.class);
        if (sysUser == null) throw new RuntimeException("令牌号错误或者已经失效!");
        return sysUser;
    }
}
