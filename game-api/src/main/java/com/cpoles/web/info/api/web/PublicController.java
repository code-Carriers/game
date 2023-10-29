package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class PublicController {

    private final SysUserService sysUserService;

    @Autowired
    public PublicController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "HELLO, WORLD! WELCOME TO WEB INFO API...";
    }

    @GetMapping(value = "/login")
    public String login(@RequestParam("code") String code,
                        @RequestParam("password") String password,
                        HttpServletRequest request) {
        return this.sysUserService.login(code, password, request.getRemoteAddr());
    }

}
