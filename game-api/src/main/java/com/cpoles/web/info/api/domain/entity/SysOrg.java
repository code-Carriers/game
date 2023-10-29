package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("Duplicates")
@Entity
@Table(name = "sys_org")
public class SysOrg extends AuditableObject implements BeanBuilder<SysOrg> {
    private static final long serialVersionUID = -1112137651146316964L;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "enable_flag")
    private Boolean enableFlag;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Boolean enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public SysOrg build() {
        return new SysOrg();
    }

    public String valid() {
        StringBuilder validMessage = new StringBuilder();
        if (StringUtils.isEmpty(this.code)) validMessage.append("代码不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.name)) validMessage.append("名称不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.fullName)) validMessage.append("全称不能为空;").append(System.lineSeparator());
        return validMessage.toString();
    }
}