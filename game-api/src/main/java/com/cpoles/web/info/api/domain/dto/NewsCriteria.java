package com.cpoles.web.info.api.domain.dto;

import com.cpoles.framework.jpa.domain.AbstractPageCriteria;
import com.cpoles.framework.jpa.domain.FreeFilter;
import com.cpoles.framework.jpa.domain.LogicalOperator;
import com.cpoles.web.info.api.utility.StringUtil;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NewsCriteria extends AbstractPageCriteria {

    private String type;
    private String web;
    private String language;
    private String catalog;
    private String keyword;
    private LocalDateTime startDt;
    private LocalDateTime endDt;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public LocalDateTime getStartDt() {
        return startDt;
    }

    public void setStartDt(LocalDateTime startDt) {
        this.startDt = startDt;
    }

    public LocalDateTime getEndDt() {
        return endDt;
    }

    public void setEndDt(LocalDateTime endDt) {
        this.endDt = endDt;
    }

    public List<FreeFilter> buildFilters() {
        List<FreeFilter> freeFilters = new ArrayList<>();

        freeFilters.add(new FreeFilter(LogicalOperator.And, "x.web  = '" + this.web + "'"));

        if (!StringUtils.isEmpty(this.catalog)) {
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.catalog  = '" + this.catalog + "'"));
        }

        if (!StringUtils.isEmpty(this.language)) {
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.language  = '" + this.language + "' OR x.language  = '中英文'"));
        }

        if (!StringUtils.isEmpty(this.keyword)) {
            keyword = StringUtil.getSqlLikeParameter(keyword);
            String filterString = "x.title  LIKE '" + this.keyword + "'"
                    + " OR x.summary  LIKE '" + this.keyword + "'"
                    + " OR x.id IN (SELECT c.newsId FROM NewsContent c WHERE c.content LIKE '" + this.keyword + "')";
            freeFilters.add(new FreeFilter(LogicalOperator.And, filterString));
        }

        if ("hp".equals(type)) {
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.visible  = 1"));
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.hpVisible  = 1"));
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.validStartDt is null or x.validStartDt >= '" + LocalDateTime.now() + "'"));
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.validEndDt is null or x.validEndDt < '" + LocalDateTime.now() + "'"));
        } else if ("list".equals(type)) {
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.visible  = 1"));
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.validStartDt is null or x.validStartDt >= '" + LocalDateTime.now() + "'"));
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.validEndDt is null or x.validEndDt < '" + LocalDateTime.now() + "'"));
        }

        if (startDt != null && endDt != null && startDt.isBefore(endDt)) {
            freeFilters.add(new FreeFilter(LogicalOperator.And, "x.publishDt >= '" + startDt + "' AND x.publishDt < '" + endDt + "'"));
        }

        return freeFilters;
    }

    @Override
    protected void beforeCollect() {
        web = StringUtil.removeNull(web);

        if ("CN".equals(language))
            language = "中文";
        else if ("EN".equals(language))
            language = "英文";
    }
}
