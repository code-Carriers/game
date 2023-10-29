package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_avatar")
public class SysUserAvatar extends AuditableObject implements BeanBuilder<SysUserAvatar> {
    private static final long serialVersionUID = -838216487795285210L;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "avatar")
    private String avatar;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public SysUserAvatar build() {
        return new SysUserAvatar();
    }
}
