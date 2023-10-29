package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_org_api_log")
public class SysOrgApiLog extends AuditableObject implements BeanBuilder<SysOrgApiLog> {
    private static final long serialVersionUID = 3424153501910022332L;

    @Column(name = "org_id")
    private String orgId;

    @Column(name = "app_key")
    private String appKey;

    @Column(name = "sys_module")
    private String sysModule;

    @Column(name = "invoke_url")
    private String invokeUrl;

    @Column(name = "invoke_data")
    private String invokeData;

    @Column(name = "invoke_dt")
    private LocalDateTime invokeDt;

    @Column(name = "invoke_ip")
    private String invokeIp;

    @Column(name = "response_status")
    private String responseStatus;

    @Column(name = "response_message")
    private String responseMessage;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getSysModule() {
        return sysModule;
    }

    public void setSysModule(String sysModule) {
        this.sysModule = sysModule;
    }

    public String getInvokeUrl() {
        return invokeUrl;
    }

    public void setInvokeUrl(String invokeUrl) {
        this.invokeUrl = invokeUrl;
    }

    public String getInvokeData() {
        return invokeData;
    }

    public void setInvokeData(String invokeData) {
        this.invokeData = invokeData;
    }

    public LocalDateTime getInvokeDt() {
        return invokeDt;
    }

    public void setInvokeDt(LocalDateTime invokeDt) {
        this.invokeDt = invokeDt;
    }

    public String getInvokeIp() {
        return invokeIp;
    }

    public void setInvokeIp(String invokeIp) {
        this.invokeIp = invokeIp;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public SysOrgApiLog build() {
        return new SysOrgApiLog();
    }
}