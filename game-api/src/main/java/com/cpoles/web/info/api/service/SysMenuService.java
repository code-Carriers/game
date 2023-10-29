package com.cpoles.web.info.api.service;

import com.cpoles.web.info.api.domain.entity.SysMenu;

import java.util.List;

public interface SysMenuService {

    List<SysMenu> getSysMenusByAppId(String appId, String token);
}
