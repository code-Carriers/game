package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_user_log")
public class SysUserLog extends AuditableObject implements BeanBuilder<SysUserLog> {
    private static final long serialVersionUID = -4412832996322842327L;

    @Column(name = "log_dt")
    private LocalDateTime logDt;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "sys_module")
    private String sysModule;

    @Column(name = "ref_id")
    private String refId;

    @Column(name = "status")
    private String status;

    @Column(name = "action")
    private String action;

    @Column(name = "summary")
    private String summary;

    @Column(name = "content")
    private String content;

    @Column(name = "ip_address")
    private String ipAddress;

    public LocalDateTime getLogDt() {
        return logDt;
    }

    public void setLogDt(LocalDateTime logDt) {
        this.logDt = logDt;
    }

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

    public String getSysModule() {
        return sysModule;
    }

    public void setSysModule(String sysModule) {
        this.sysModule = sysModule;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public SysUserLog build() {
        return new SysUserLog();
    }
}
