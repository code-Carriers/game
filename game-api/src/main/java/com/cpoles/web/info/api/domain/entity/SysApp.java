package com.cpoles.web.info.api.domain.entity;


import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_app")
public class SysApp extends AuditableObject implements BeanBuilder<SysApp> {
    private static final long serialVersionUID = -4819182579642572900L;

    @Column(name = "name")
    private String name;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "type")
    private String type;

    @Column(name = "remark")
    private String remark;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public SysApp build() {
        return new SysApp();
    }
}