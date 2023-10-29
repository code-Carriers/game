package com.cpoles.web.info.api.service;

import com.cpoles.web.info.api.domain.entity.SysOrg;

import java.util.List;

public interface SysOrgService {

    List<SysOrg> indexSysOrg();

    SysOrg updateSysOrg(SysOrg data, String token);

    void deleteSysOrg(String id, String token);
}
