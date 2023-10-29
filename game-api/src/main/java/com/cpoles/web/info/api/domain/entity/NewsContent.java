package com.cpoles.web.info.api.domain.entity;

import com.cpoles.framework.core.BeanBuilder;
import com.cpoles.framework.jpa.domain.AuditableObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "news_Content")
public class NewsContent extends AuditableObject implements BeanBuilder<NewsContent> {
    private static final long serialVersionUID = -4346815267609392960L;

    @Column(name = "news_id")
    private String newsId;

    @Column(name = "content")
    private String content;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public NewsContent build() {
        return new NewsContent();
    }
}
