package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@SuppressWarnings({"Duplicates"})
@Entity
@Table(name = "guest_book")
public class GuestBook extends AuditableObject implements BeanBuilder<GuestBook> {
    private static final long serialVersionUID = 5913216520497322741L;

    @Column(name = "web")
    private String web;

    @Column(name = "name")
    private String name;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "company")
    private String company;

    @Column(name = "content")
    private String content;

    @Column(name = "business_type")
    private String businessType;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "response_status")
    private String responseStatus;

    @Column(name = "response_remark")
    private String responseRemark;

    @Column(name = "response_by")
    private String responseBy;

    @Column(name = "response_dt")
    private LocalDateTime responseDt;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getResponseRemark() {
        return responseRemark;
    }

    public void setResponseRemark(String responseRemark) {
        this.responseRemark = responseRemark;
    }

    public String getResponseBy() {
        return responseBy;
    }

    public void setResponseBy(String responseBy) {
        this.responseBy = responseBy;
    }

    public LocalDateTime getResponseDt() {
        return responseDt;
    }

    public void setResponseDt(LocalDateTime responseDt) {
        this.responseDt = responseDt;
    }

    @Override
    public GuestBook build() {
        return new GuestBook();
    }

    public String valid() {
        StringBuilder validMessage = new StringBuilder();
        if (StringUtils.isEmpty(this.web)) validMessage.append("网站不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.name)) validMessage.append("姓名不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.mobile)) validMessage.append("手机号码不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.content)) validMessage.append("需求描述不能为空;").append(System.lineSeparator());
        return validMessage.toString();
    }
}
