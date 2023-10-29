package com.cpoles.web.info.api.service;

import com.cpoles.web.info.api.domain.entity.SysUser;

public interface SysCacheService {
    void put(String token, SysUser sysUser);

    void evict(String token);

    boolean exists(String token);

    SysUser getLoginUser(String token);

    String getLoginUserId(String token);

    String getLoginUserName(String token);

    String getLoginUserOrgId(String token);

    String getLoginUserOrgName(String token);
}
