package com.cpoles.web.info.api.domain.dto;

import com.cpoles.framework.jpa.annotation.FilterPart;
import com.cpoles.framework.jpa.annotation.OrderByPart;
import com.cpoles.framework.jpa.domain.AbstractPageCriteria;
import com.cpoles.web.info.api.utility.StringUtil;
import org.springframework.util.StringUtils;

public class SysUserQueryCriteria extends AbstractPageCriteria {

    @FilterPart(where = "orgId = :orgId")
    private String orgId;

    @FilterPart(where = "name like :name")
    private String name;

    @OrderByPart(direction = OrderByPart.Direction.DESC)
    private String enableFlagOrder = "enableFlag";

    @OrderByPart(direction = OrderByPart.Direction.DESC)
    private String adminFlagOrder = "adminFlag";

    @OrderByPart(direction = OrderByPart.Direction.ASC)
    private String codeOrder = "code";

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void beforeCollect() {
        if (!StringUtils.isEmpty(name))
            name = StringUtil.getSqlLikeParameter(name);
    }
}
