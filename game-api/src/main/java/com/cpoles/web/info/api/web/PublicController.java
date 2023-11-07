package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.service.SysUserService;
import com.cpoles.web.info.api.utility.IpUtil;
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

    @GetMapping(value = "/login/sms")
    public String smsLogin(@RequestParam("phone") String phone,
                           @RequestParam("smsCode") String smsCode,
                           @RequestParam("captchaId") String captchaId,
                           HttpServletRequest request) {
        return this.sysUserService.smsLogin(phone, smsCode, captchaId, request.getRemoteAddr());
    }

    @GetMapping(value = "/register")
    public void register(@RequestParam("phone") String phone,
                         @RequestParam("password") String password,
                         @RequestParam("smsCode") String smsCode,
                         @RequestParam("captchaId") String captchaId,
                         HttpServletRequest request) {
        this.sysUserService.register(phone, password, smsCode, captchaId);
    }

    @GetMapping(value = "/sendCode")
    public String sendCode(@RequestParam("phone") String phone,
                           HttpServletRequest request) {
        String ipAddress = IpUtil.getIpAddress(request);
        return this.sysUserService.sendCode(ipAddress, phone);
    }

}
