package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_org_api_auth")
public class SysOrgApiAuth extends AuditableObject implements BeanBuilder<SysOrgApiAuth> {
    private static final long serialVersionUID = -5943767592696524261L;

    @Column(name = "org_id")
    private String orgId;

    @Column(name = "app_key")
    private String appKey;

    @Column(name = "app_security")
    private String appSecurity;

    @Column(name = "state")
    private int state;

    @Column(name = "remark")
    private String remark;

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

    public String getAppSecurity() {
        return appSecurity;
    }

    public void setAppSecurity(String appSecurity) {
        this.appSecurity = appSecurity;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public SysOrgApiAuth build() {
        return new SysOrgApiAuth();
    }
}
