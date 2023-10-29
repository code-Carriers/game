package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_login")
public class SysUserLogin extends AuditableObject implements BeanBuilder<SysUserLogin> {
    private static final long serialVersionUID = -2090519044706599227L;

    //用户id
    @Column(name = "user_id")
    private String userId;

    //登录代码
    @Column(name = "login_code")
    private String loginCode;

    //登录方式
    @Column(name = "login_type")
    private String loginType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    @Override
    public SysUserLogin build() {
        return new SysUserLogin();
    }
}
