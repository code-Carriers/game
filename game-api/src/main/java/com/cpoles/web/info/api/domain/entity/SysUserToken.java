package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_user_token")
public class SysUserToken extends AuditableObject implements BeanBuilder<SysUserToken> {
    private static final long serialVersionUID = -4935960922836277697L;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "login_code")
    private String loginCode;

    @Column(name = "login_type")
    private String loginType;

    @Column(name = "token")
    private String token;

    @Column(name = "token_valid_dt")
    private LocalDateTime tokenValidDt;

    @Column(name = "login_position")
    private String loginPosition;

    @Column(name = "login_dt")
    private LocalDateTime loginDt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getTokenValidDt() {
        return tokenValidDt;
    }

    public void setTokenValidDt(LocalDateTime tokenValidDt) {
        this.tokenValidDt = tokenValidDt;
    }

    public String getLoginPosition() {
        return loginPosition;
    }

    public void setLoginPosition(String loginPosition) {
        this.loginPosition = loginPosition;
    }

    public LocalDateTime getLoginDt() {
        return loginDt;
    }

    public void setLoginDt(LocalDateTime loginDt) {
        this.loginDt = loginDt;
    }

    @Override
    public SysUserToken build() {
        return new SysUserToken();
    }
}
