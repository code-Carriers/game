package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_user")
public class SysUser extends AuditableObject implements BeanBuilder<SysUser> {
    private static final long serialVersionUID = -6075009589100941724L;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "enable_flag")
    private Boolean enableFlag;

    @Column(name = "admin_flag")
    private Boolean adminFlag;

    @Column(name = "tel")
    private String tel;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "qq")
    private String qq;

    @Column(name = "wxchat")
    private String wxchat;

    @Column(name = "remark")
    private String remark;

    @Column(name = "login_count")
    private int loginCount;

    @Column(name = "last_login_position")
    private String lastLoginPosition;

    @Column(name = "last_login_dt")
    private LocalDateTime lastLoginDt;

    @Transient
    private String orgName;

    @Transient
    private String orgFullName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Boolean enableFlag) {
        this.enableFlag = enableFlag;
    }

    public Boolean getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(Boolean adminFlag) {
        this.adminFlag = adminFlag;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWxchat() {
        return wxchat;
    }

    public void setWxchat(String wxchat) {
        this.wxchat = wxchat;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public String getLastLoginPosition() {
        return lastLoginPosition;
    }

    public void setLastLoginPosition(String lastLoginPosition) {
        this.lastLoginPosition = lastLoginPosition;
    }

    public LocalDateTime getLastLoginDt() {
        return lastLoginDt;
    }

    public void setLastLoginDt(LocalDateTime lastLoginDt) {
        this.lastLoginDt = lastLoginDt;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgFullName() {
        return orgFullName;
    }

    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName;
    }

    @Override
    public SysUser build() {
        return new SysUser();
    }

    public String valid() {
        StringBuilder validMessage = new StringBuilder();
        if (StringUtils.isEmpty(this.code)) validMessage.append("代码不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.name)) validMessage.append("名称不能为空;").append(System.lineSeparator());
        return validMessage.toString();
    }
}
