package com.cpoles.web.info.api.domain.dto;

import com.cpoles.framework.jpa.domain.AbstractPageCriteria;
import com.cpoles.framework.jpa.domain.FreeFilter;
import com.cpoles.framework.jpa.domain.LogicalOperator;
import com.cpoles.web.info.api.utility.StringUtil;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class GuestBookCriteria extends AbstractPageCriteria {

    private String web;
    private String keyword;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<FreeFilter> buildFilters() {
        List<FreeFilter> freeFilters = new ArrayList<>();

        freeFilters.add(new FreeFilter(LogicalOperator.And, "x.web  = '" + this.web + "'"));

        if (!StringUtils.isEmpty(this.keyword)) {
            keyword = StringUtil.getSqlLikeParameter(keyword);
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.title  LIKE '" + this.keyword + "'"));
        }

        return freeFilters;
    }

    @Override
    protected void beforeCollect() {
        web = StringUtil.removeNull(web);
    }
}
