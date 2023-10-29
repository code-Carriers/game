package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@SuppressWarnings("Duplicates")
@Entity
@Table(name = "news")
public class News extends AuditableObject implements BeanBuilder<News> {
    private static final long serialVersionUID = -8580249879548533029L;

    @Column(name = "web")
    private String web;

    @Column(name = "no")
    private int no;

    @Column(name = "catalog")
    private String catalog;

    @Column(name = "language")
    private String language;

    @Column(name = "title")
    private String title;

    @Column(name = "summary")
    private String summary;

    @Transient
    private String content;

    @Column(name = "title_image")
    private String titleImage;

    @Column(name = "visible")
    private Boolean visible;

    @Column(name = "hp_visible")
    private Boolean hpVisible;

    @Column(name = "top_visible")
    private Boolean topVisible;

    @Column(name = "view_count")
    private int viewCount;

    @Column(name = "publish_by")
    private String publishBy;

    @Column(name = "publish_dt")
    private LocalDateTime publishDt;

    @Column(name = "valid_start_dt")
    private LocalDateTime validStartDt;

    @Column(name = "valid_end_dt")
    private LocalDateTime validEndDt;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getHpVisible() {
        return hpVisible;
    }

    public void setHpVisible(Boolean hpVisible) {
        this.hpVisible = hpVisible;
    }

    public Boolean getTopVisible() {
        return topVisible;
    }

    public void setTopVisible(Boolean topVisible) {
        this.topVisible = topVisible;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getPublishBy() {
        return publishBy;
    }

    public void setPublishBy(String publishBy) {
        this.publishBy = publishBy;
    }

    public LocalDateTime getPublishDt() {
        return publishDt;
    }

    public void setPublishDt(LocalDateTime publishDt) {
        this.publishDt = publishDt;
    }

    public LocalDateTime getValidStartDt() {
        return validStartDt;
    }

    public void setValidStartDt(LocalDateTime validStartDt) {
        this.validStartDt = validStartDt;
    }

    public LocalDateTime getValidEndDt() {
        return validEndDt;
    }

    public void setValidEndDt(LocalDateTime validEndDt) {
        this.validEndDt = validEndDt;
    }

    @Override
    public News build() {
        return new News();
    }

    public String valid() {
        StringBuilder validMessage = new StringBuilder();
        if (StringUtils.isEmpty(this.web)) validMessage.append("网站不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.catalog)) validMessage.append("栏目不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.title)) validMessage.append("标题不能为空;").append(System.lineSeparator());
        if (StringUtils.isEmpty(this.content)) validMessage.append("内容不能为空;").append(System.lineSeparator());
        return validMessage.toString();
    }
}
