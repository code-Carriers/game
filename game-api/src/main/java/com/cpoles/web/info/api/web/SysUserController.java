package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.domain.dto.SysUserQueryCriteria;
import com.cpoles.web.info.api.domain.entity.SysUser;
import com.cpoles.web.info.api.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys_user")
public class SysUserController {

    private final SysUserService sysUserService;

    @Autowired
    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @PostMapping(value = "index")
    public List<SysUser> indexSysUser(@RequestBody SysUserQueryCriteria criteria) {
        return this.sysUserService.indexSysUser(criteria);
    }

    @PostMapping()
    public SysUser updateSysUser(@RequestBody SysUser data,
                                 @RequestHeader(value = "token") String token) {
        return this.sysUserService.updateSysUser(data, token);
    }

    @DeleteMapping(value = "{id}")
    public void deleteSysUser(@PathVariable String id,
                              @RequestHeader(value = "token") String token) {
        this.sysUserService.deleteSysUser(id, token);
    }

    @GetMapping(value = "/reset_password")
    public void resetPassword(@RequestParam("id") String id,
                              @RequestParam("new_password") String newPassword,
                              @RequestHeader(value = "token") String token) {
        this.sysUserService.resetPassword(id, newPassword, token);
    }
}
