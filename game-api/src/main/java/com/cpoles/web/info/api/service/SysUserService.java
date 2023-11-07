package com.cpoles.web.info.api.service;

import com.cpoles.web.info.api.domain.dto.SysUserQueryCriteria;
import com.cpoles.web.info.api.domain.entity.SysUser;

import java.util.List;

public interface SysUserService {

    String login(String code, String password, String remoteIp);
    String sendCode(String ipAddress,String phone);

    String smsLogin(String phone, String smsCode, String captchaId, String remoteAddr);

    void register(String phone, String password, String smsCode, String captchaId);

    void loginOut(String token);

    String getUserAvatar(String userId);

    String getUserAvatarByToken(String token);

    void uploadUserAvatar(String avatar, String token);

    void changePassword(String oldPassword, String newPPassword, String token);

    //维护
    List<SysUser> indexSysUser(SysUserQueryCriteria criteria);

    SysUser updateSysUser(SysUser data, String token);

    void deleteSysUser(String id, String token);

    void resetPassword(String id, String newPassword, String token);
}
