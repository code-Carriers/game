package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.domain.entity.SysOrg;
import com.cpoles.web.info.api.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys_org")
public class SysOrgController {

    private final SysOrgService sysOrgService;

    @Autowired
    public SysOrgController(SysOrgService sysOrgService) {
        this.sysOrgService = sysOrgService;
    }

    @GetMapping()
    public List<SysOrg> indexSysOrg() {
        return this.sysOrgService.indexSysOrg();
    }

    @PostMapping()
    public SysOrg updateSysOrg(@RequestBody SysOrg data,
                               @RequestHeader(value = "token") String token) {
        return this.sysOrgService.updateSysOrg(data, token);
    }

    @DeleteMapping(value = "{id}")
    public void deleteSysOrg(@PathVariable String id,
                             @RequestHeader(value = "token") String token) {
        this.sysOrgService.deleteSysOrg(id, token);
    }
}
