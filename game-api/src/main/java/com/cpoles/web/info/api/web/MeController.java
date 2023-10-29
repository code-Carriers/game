package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.domain.entity.SysMenu;
import com.cpoles.web.info.api.domain.entity.SysUser;
import com.cpoles.web.info.api.service.SysCacheService;
import com.cpoles.web.info.api.service.SysMenuService;
import com.cpoles.web.info.api.service.SysUserService;
import com.cpoles.web.info.api.utility.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/me")
public class MeController {

    private final SysCacheService sysCacheService;
    private final SysMenuService sysMenuService;
    private final SysUserService sysUserService;

    @Autowired
    public MeController(SysCacheService sysCacheService,
                        SysMenuService sysMenuService,
                        SysUserService sysUserService) {
        this.sysCacheService = sysCacheService;
        this.sysMenuService = sysMenuService;
        this.sysUserService = sysUserService;
    }

    @GetMapping("/token")
    public SysUser getLoginUserInfo(@RequestHeader(value = "token") String token) {
        return this.sysCacheService.getLoginUser(token);
    }

    @GetMapping("/menus")
    public List<SysMenu> getSysMenusByAppId(@RequestParam("app_id") String appId,
                                            @RequestHeader(value = "token") String token) {
        return this.sysMenuService.getSysMenusByAppId(appId, token);
    }

    @GetMapping(value = "/avatar")
    public String getUserAvatarByToken(@RequestHeader(value = "token") String token) {
        return this.sysUserService.getUserAvatarByToken(token);
    }

    @PostMapping(value = "/avatar")
    public void uploadUserAvatar(HttpServletRequest request,
                                 @RequestHeader(value = "token") String token) {
        try {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            byte[] fileContent = Objects.requireNonNull(multipartRequest.getFile("file")).getBytes();
            String avatar = StringUtil.getBase64String(fileContent);
            this.sysUserService.uploadUserAvatar(avatar, token);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping(value = "/change_password")
    public void changePassword(@RequestParam("old_password") String oldPassword,
                               @RequestParam("new_password") String newPPassword,
                               @RequestHeader(value = "token") String token) {
        this.sysUserService.changePassword(oldPassword, newPPassword, token);
    }

    @GetMapping(value = "/logout")
    public void loginOut(@RequestHeader String token) {
        this.sysUserService.loginOut(token);
    }
}
