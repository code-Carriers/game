package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "code_web")
public class CodeWeb extends AuditableObject implements BeanBuilder<CodeWeb> {
    private static final long serialVersionUID = -3959077139117728825L;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "catalogs")
    private String catalogs;

    @Column(name = "company")
    private String company;

    @Column(name = "register_dt")
    private LocalDateTime registerDt;

    @Column(name = "register_no")
    private String registerNo;

    @Column(name = "admin")
    private String admin;

    @Column(name = "email")
    private String email;

    @Column(name = "lan_ip")
    private String lanIp;

    @Column(name = "wan_ip")
    private String wanIp;

    @Column(name = "remark")
    private String remark;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(String catalogs) {
        this.catalogs = catalogs;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDateTime getRegisterDt() {
        return registerDt;
    }

    public void setRegisterDt(LocalDateTime registerDt) {
        this.registerDt = registerDt;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanIp() {
        return lanIp;
    }

    public void setLanIp(String lanIp) {
        this.lanIp = lanIp;
    }

    public String getWanIp() {
        return wanIp;
    }

    public void setWanIp(String wanIp) {
        this.wanIp = wanIp;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public CodeWeb build() {
        return new CodeWeb();
    }

    public String valid() {
        StringBuilder validMessage = new StringBuilder();
        if (StringUtils.isEmpty(this.code)) validMessage.append("代码不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.name)) validMessage.append("名称不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.url)) validMessage.append("网址不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.company)) validMessage.append("公司不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.registerNo)) validMessage.append("注册编号不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.admin)) validMessage.append("管理员不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.email)) validMessage.append("管理员邮箱不能为空;").append(System.lineSeparator());
        return validMessage.toString();
    }
}
