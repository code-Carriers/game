package com.cpoles.web.info.api.service.impl;

import com.cpoles.framework.jpa.service.BusinessService;
import com.cpoles.web.info.api.domain.dto.SysUserQueryCriteria;
import com.cpoles.web.info.api.domain.entity.*;
import com.cpoles.web.info.api.repository.*;
import com.cpoles.web.info.api.service.SysCacheService;
import com.cpoles.web.info.api.service.SysUserService;
import com.cpoles.web.info.api.utility.ShaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


/**
 * @author HAWKZHOU
 */

@Service
public class SysUserServiceImpl extends BusinessService implements SysUserService {

    private final SysCacheService sysCacheService;
    private final SysOrgRepository sysOrgRepository;
    private final SysUserRepository sysUserRepository;
    private final SysUserAvatarRepository sysUserAvatarRepository;
    private final SysUserLoginRepository sysUserLoginRepository;
    private final SysUserTokenRepository sysUserTokenRepository;

    @Autowired
    public SysUserServiceImpl(SysCacheService sysCacheService,
                              SysOrgRepository sysOrgRepository,
                              SysUserRepository sysUserRepository,
                              SysUserAvatarRepository sysUserAvatarRepository,
                              SysUserLoginRepository sysUserLoginRepository,
                              SysUserTokenRepository sysUserTokenRepository) {
        this.sysCacheService = sysCacheService;
        this.sysOrgRepository = sysOrgRepository;
        this.sysUserRepository = sysUserRepository;
        this.sysUserAvatarRepository = sysUserAvatarRepository;
        this.sysUserLoginRepository = sysUserLoginRepository;
        this.sysUserTokenRepository = sysUserTokenRepository;
    }

    @Override
    @Transactional
    public String login(String code, String password, String remoteIp) {
        //检查
        if (StringUtils.isEmpty(code) || StringUtils.isEmpty(password)) {
            throw new RuntimeException("用户代码和密码不能为空,请检查!");
        }

        //获取有效用户
        SysUser sysUser = getUserByPassword(code, password);

        //获取有效组织
        SysOrg sysOrg = getValidOrgByLogin(sysUser.getOrgId());

        //执行登录
        return doLogin(sysUser.getId(), code, remoteIp, sysUser, sysOrg);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void loginOut(String token) {
        Optional<SysUserToken> sysUserLoginRecord = this.sysUserTokenRepository.findByToken(token);
        if (sysUserLoginRecord.isPresent()) {
            SysUserToken sysUserToken = sysUserLoginRecord.get();
            sysUserToken.setTokenValidDt(LocalDateTime.now());
            sysUserTokenRepository.saveAndFlush(sysUserToken);
        }

        this.sysCacheService.evict(token);
    }

    @Override
    public String getUserAvatar(String userId) {
        Optional<SysUserAvatar> sysUserAvatar = this.sysUserAvatarRepository.findFirstByUserIdOrderByCreatedDtDesc(userId);
        return sysUserAvatar.map(sysUserAvatar1 -> "data:image/png;base64," + sysUserAvatar1.getAvatar()).orElse("");
    }

    @Override
    public String getUserAvatarByToken(String token) {
        String userId = this.sysCacheService.getLoginUserId(token);
        return getUserAvatar(userId);
    }

    @Override
    public void uploadUserAvatar(String avatar, String token) {
        if (StringUtils.isEmpty(avatar)) {
            throw new RuntimeException("头像不能为空");
        }

        String userId = this.sysCacheService.getLoginUserId(token);
        String userName = this.sysCacheService.getLoginUserName(token);

        SysUserAvatar newRow = new SysUserAvatar();
        newRow.setUserId(userId);
        newRow.setAvatar(avatar);
        newRow.audit(userName);
        this.sysUserAvatarRepository.save(newRow);
    }

    @Override
    public void changePassword(String oldPassword, String newPassword, String token) {
        //检查
        if (StringUtils.isEmpty(newPassword)) {
            throw new RuntimeException("新密码不能为空");
        }

        //获取用户
        SysUser sysUser = this.sysCacheService.getLoginUser(token);

        //检查原密码
        String userId = sysUser.getId();
        String validPwd = userId.toLowerCase().replaceAll("-", "") + oldPassword;
        validPwd = ShaUtil.getShaString(validPwd);
        if (!validPwd.equals(sysUser.getPassword())) {
            throw new RuntimeException("用户密码错误,请检查!");
        }

        //更新密码
        String passwordValue = ShaUtil.getShaString(userId.toLowerCase().replaceAll("-", "") + newPassword);

        sysUser.setPassword(passwordValue);
        sysUser.audit(sysUser.getName());
        sysUserRepository.saveAndFlush(sysUser);
    }

    @Override
    public List<SysUser> indexSysUser(SysUserQueryCriteria criteria) {
        List<SysUser> result = this.find(SysUser.class, criteria.tokens());
        if (result.size() == 0) {
            return result;
        }

        fillUserData(result);
        return result;
    }

    private void fillUserData(List<SysUser> sysUsers) {
        List<SysOrg> sysOrgs = this.sysOrgRepository.findAll();
        for (SysUser sysUser : sysUsers) {
            Optional<SysOrg> optionalSysOrg = sysOrgs.stream().filter(p -> sysUser.getOrgId().equals(p.getId())).findFirst();
            if (optionalSysOrg.isPresent()) {
                sysUser.setOrgName(optionalSysOrg.get().getName());
                sysUser.setOrgFullName(optionalSysOrg.get().getFullName());
            }
        }
    }

    @Override
    public SysUser updateSysUser(SysUser data, String token) {
        //检查
        SysUser loginUser = this.sysCacheService.getLoginUser(token);
        if (!loginUser.getAdminFlag()) {
            throw new RuntimeException("权限不足");
        }

        //检查数据
        String validMessage = data.valid();
        if (!StringUtils.isEmpty(validMessage)) {
            throw new RuntimeException(validMessage);
        }

        //检查组织
        Optional<SysOrg> optionalSysOrg = sysOrgRepository.findById(data.getOrgId());
        if (!optionalSysOrg.isPresent()) {
            throw new RuntimeException("组织ID不存在!");
        }

        String userName = loginUser.getName();

        //新增或者更新
        if (StringUtils.isEmpty(data.getId())) {
            //新增用户
            //初始值
            data.setCode(data.getCode().trim().toUpperCase());
            data.setEnableFlag(true);
            data.audit(userName);

            //检查
            if (this.sysUserRepository.existsByCode(data.getCode())) {
                throw new RuntimeException("代码已存在!");
            }
            if (StringUtils.isEmpty(data.getPassword())) {
                throw new RuntimeException("密码不能为空!");
            }

            //保存新增
            SysUser result = this.sysUserRepository.saveAndFlush(data);
            String userId = result.getId();

            //重新保存密码
            result.setPassword(ShaUtil.getShaString(userId.toLowerCase().replaceAll("-", "") + ShaUtil.getShaString(data.getPassword())));
            this.sysUserRepository.save(result);

            //增加用户登录
            addSysUserLogin(result.getId(), result.getCode(), "code", result.getCreatedBy());

            //返回
            return result;
        } else {
            //检查用户代码
            Optional<SysUser> optionalSysUser = sysUserRepository.findById(data.getId());
            if (!optionalSysUser.isPresent()) {
                throw new RuntimeException("用户不存在，无法编辑!");
            }
            SysUser sysUser = optionalSysUser.get();

            //赋值
            data.audit(userName);

            //变更用户登录
            if (!sysUser.getCode().equals(data.getCode())) {
                if (this.sysUserLoginRepository.existsByLoginCode(data.getCode())) {
                    throw new RuntimeException("新用户代码已经存在!");
                }

                Optional<SysUserLogin> optionalUserLogin = sysUserLoginRepository.findByLoginCodeAndLoginType(sysUser.getCode(), "code");
                if (optionalUserLogin.isPresent()) {
                    SysUserLogin userLogin = optionalUserLogin.get();
                    userLogin.setLoginCode(data.getCode());
                    sysUserLoginRepository.saveAndFlush(userLogin);
                } else {
                    addSysUserLogin(data.getId(), data.getCode(), "code", userName);
                }
            }

            //保存
            return this.sysUserRepository.saveAndFlush(data);
        }
    }

    @SuppressWarnings("SameParameterValue")
    private void addSysUserLogin(String userId, String loginCode, String loginType, String createdBy) {
        SysUserLogin userLogin = new SysUserLogin();
        userLogin.setUserId(userId);
        userLogin.setLoginCode(loginCode);
        userLogin.setLoginType(loginType.toLowerCase());
        userLogin.audit(createdBy);
        sysUserLoginRepository.saveAndFlush(userLogin);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void deleteSysUser(String id, String token) {
        //检查
        SysUser loginUser = this.sysCacheService.getLoginUser(token);
        if (!loginUser.getAdminFlag()) {
            throw new RuntimeException("权限不足");
        }

        this.sysUserRepository.deleteById(id);

        List<SysUserLogin> sysUserLoginRows = this.sysUserLoginRepository.findByUserId(id);
        this.sysUserLoginRepository.deleteAll(sysUserLoginRows);

        List<SysUserAvatar> sysUserAvatarRows = this.sysUserAvatarRepository.findByUserId(id);
        this.sysUserAvatarRepository.deleteAll(sysUserAvatarRows);
    }

    @Override
    public void resetPassword(String id, String newPassword, String token) {
        //检查
        SysUser loginUser = this.sysCacheService.getLoginUser(token);
        if (!loginUser.getAdminFlag()) {
            throw new RuntimeException("权限不足");
        }

        if (StringUtils.isEmpty(newPassword)) {
            throw new RuntimeException("新密码不能为空");
        }

        //获取用户
        Optional<SysUser> optionalSysUser = sysUserRepository.findById(id);
        if (!optionalSysUser.isPresent()) {
            throw new RuntimeException("用户不存在,请检查!");
        }
        SysUser sysUser = optionalSysUser.get();

        //更新密码
        updatePassword(sysUser, newPassword, loginUser.getName());
    }

    private void updatePassword(SysUser sysUser, String password, String modifiedBy) {
        String userId = sysUser.getId();
        String passwordValue = ShaUtil.getShaString(userId.toLowerCase().replaceAll("-", "") + password);

        sysUser.setPassword(passwordValue);
        sysUser.setModifiedBy(modifiedBy);
        sysUser.setModifiedDt(LocalDateTime.now());
        sysUserRepository.saveAndFlush(sysUser);
    }

    private SysUser getUserByPassword(String code, String password) {
        //Get Valid User
        SysUser sysUser = getValidUserByLoginCode(code);
        String userId = sysUser.getId();

        //Password Sha
        password = userId.toLowerCase().replaceAll("-", "") + password;
        password = ShaUtil.getShaString(password);

        //Check Password
        if (!password.equals(sysUser.getPassword())) {
            throw new RuntimeException("用户代码或者密码错误,请检查!");
        }
        if (!sysUser.getEnableFlag()) {
            throw new RuntimeException("用户账户已经禁止，无法登陆!");
        }

        return sysUser;
    }

    private SysUser getValidUserByLoginCode(String loginCode) {
        //Get User Access
        List<SysUserLogin> sysUserLoginRows = this.sysUserLoginRepository.findByLoginCode(loginCode);
        if (sysUserLoginRows.size() != 1) {
            throw new RuntimeException("验证失败,请检查!");
        }
        String userId = sysUserLoginRows.get(0).getUserId();

        //Get User
        Optional<SysUser> optionalSysUser = this.sysUserRepository.findById(userId);
        if (!optionalSysUser.isPresent()) {
            throw new RuntimeException("用户信息缺失,请联系客服!");
        }

        return optionalSysUser.get();
    }

    private SysOrg getValidOrgByLogin(String orgId) {
        if (StringUtils.isEmpty(orgId)) {
            throw new RuntimeException("组织未设置,请联系客服!");
        }

        Optional<SysOrg> optionalSysOrg = sysOrgRepository.findById(orgId);

        if (!optionalSysOrg.isPresent()) {
            throw new RuntimeException("组织不存在,请联系客服!");
        }
        if (!optionalSysOrg.get().getEnableFlag()) {
            throw new RuntimeException("组织账户已经禁止，无法登陆!");
        }

        return optionalSysOrg.get();
    }

    private String doLogin(String userId, String loginCode, String remoteIp, SysUser sysUser, SysOrg sysOrg) {
        //生成令牌
        String token = userId.toLowerCase().replaceAll("-", "") + UUID.randomUUID().toString().toLowerCase().replaceAll("-", "");
        token = ShaUtil.getShaString(token);

        //更新用户
        sysUser.setLoginCount(sysUser.getLoginCount() + 1);
        sysUser.setLastLoginPosition(remoteIp);
        sysUser.setLastLoginDt(LocalDateTime.now());
        this.sysUserRepository.save(sysUser);

        //增加令牌记录
        SysUserToken newRow = new SysUserToken();
        newRow.setUserId(userId);
        newRow.setUserName(sysUser.getName());
        newRow.setLoginCode(loginCode);
        newRow.setLoginType("CODE");
        newRow.setToken(token);
        newRow.setTokenValidDt(LocalDateTime.now().plusDays(1));
        newRow.setLoginPosition("0:0:0:0:0:0:0:1".equals(remoteIp) ? "127.0.0.1" : remoteIp);
        newRow.setLoginDt(LocalDateTime.now());
        newRow.setCreatedBy(sysUser.getName());
        newRow.setCreatedDt(LocalDateTime.now());
        this.sysUserTokenRepository.save(newRow);

        //设置返回值
        sysUser.setOrgName(sysOrg.getName());
        sysUser.setOrgFullName(sysOrg.getFullName());

        //加入缓存
        this.sysCacheService.put(token, sysUser);

        //返回
        return token;
    }
}

