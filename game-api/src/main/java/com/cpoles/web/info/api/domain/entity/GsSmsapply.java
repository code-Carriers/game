package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "gs_smsapply")
public class GsSmsapply extends AuditableObject implements BeanBuilder<GsSmsapply> {

    /** applyMobile */
    @Column(name = "apply_mobile")
    private String applyMobile;

    /** applyCode */
    @Column(name = "apply_code")
    private String applyCode;

    /** applyTime */
    @Column(name = "apply_time")
    private LocalDateTime applyTime;

    /** ipAddress */
    @Column(name = "ip_address")
    private String ipAddress;


    @Override
    public GsSmsapply build() {return new GsSmsapply();}

    public String getApplyMobile() {
        return applyMobile;
    }

    public void setApplyMobile(String applyMobile) {
        this.applyMobile = applyMobile;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}

