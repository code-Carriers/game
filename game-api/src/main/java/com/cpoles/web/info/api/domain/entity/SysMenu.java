package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_menu")
public class SysMenu extends AuditableObject implements BeanBuilder<SysMenu> {
    private static final long serialVersionUID = 5720421432927597265L;

    @Column(name = "app_id")
    private String appId;

    @Column(name = "name")
    private String name;

    @Column(name = "menu_uri")
    private String menuUri;

    @Column(name = "icon_uri")
    private String iconUri;

    @Column(name = "seq_no")
    private int seqNo;

    @Column(name = "checked")
    private Boolean checked;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "remark")
    private String remark;

    @Column(name = "parent_id")
    private String parentId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuUri() {
        return menuUri;
    }

    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri;
    }

    public String getIconUri() {
        return iconUri;
    }

    public void setIconUri(String iconUri) {
        this.iconUri = iconUri;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public SysMenu build() {
        return new SysMenu();
    }

}