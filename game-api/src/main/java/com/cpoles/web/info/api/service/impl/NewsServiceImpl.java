package com.cpoles.web.info.api.service.impl;

import com.cpoles.framework.jpa.service.BusinessService;
import com.cpoles.web.info.api.domain.dto.NewsCriteria;
import com.cpoles.web.info.api.domain.entity.News;
import com.cpoles.web.info.api.domain.entity.NewsContent;
import com.cpoles.web.info.api.repository.NewsContentRepository;
import com.cpoles.web.info.api.repository.NewsRepository;
import com.cpoles.web.info.api.service.NewsService;
import com.cpoles.web.info.api.service.SysCacheService;
import com.cpoles.web.info.api.utility.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl extends BusinessService implements NewsService {

    private final SysCacheService sysCacheService;
    private final NewsRepository newsRepository;
    private final NewsContentRepository newsContentRepository;

    @Autowired
    public NewsServiceImpl(SysCacheService sysCacheService,
                           NewsRepository newsRepository,
                           NewsContentRepository newsContentRepository) {
        this.sysCacheService = sysCacheService;
        this.newsRepository = newsRepository;
        this.newsContentRepository = newsContentRepository;
    }

    @Override
    public Page<News> indexData(NewsCriteria criteria) {

        String type = criteria.getType();
        type = !StringUtils.isEmpty(type) ? type.toLowerCase() : "";
        criteria.setType(type);

        List<Sort.Order> orders = new ArrayList<>();
        if ("hp".equals(type)) {
            orders.add(new Sort.Order(Sort.Direction.DESC, "no"));
        } else if ("list".equals(type)) {
            orders.add(new Sort.Order(Sort.Direction.DESC, "topVisible"));
            orders.add(new Sort.Order(Sort.Direction.DESC, "no"));
        } else {
            orders.add(new Sort.Order(Sort.Direction.DESC, "hpVisible"));
            orders.add(new Sort.Order(Sort.Direction.DESC, "topVisible"));
            orders.add(new Sort.Order(Sort.Direction.DESC, "no"));
        }

        PageRequest pageRequest = PageRequest.of(
                criteria.getPage(),
                criteria.getSize(),
                Sort.by(orders));

        return this.pageByFreeFilter(News.class, criteria.buildFilters(), pageRequest);
    }

    @Override
    public News getData(String id) {

        Optional<News> optionalNews = this.newsRepository.findById(id);
        if (!optionalNews.isPresent()) return null;
        News news = optionalNews.get();

        news.setViewCount(news.getViewCount() + 1);
        news.audit("VISITOR");
        News result = this.newsRepository.saveAndFlush(news);

        Optional<NewsContent> optionalNewsContent = this.newsContentRepository.findFirstByNewsId(id);
        if (optionalNewsContent.isPresent())
            result.setContent(optionalNewsContent.get().getContent());
        else
            result.setContent("");

        return result;
    }

    @Override
    public void updateData(News data, String token) {
        //检查
        String validMessage = data.valid();
        if (!StringUtils.isEmpty(validMessage)) throw new RuntimeException(validMessage);

        if (!sysCacheService.exists(token)) throw new RuntimeException("权限限制");

        boolean isNewData = data.isNew();
        String userName = sysCacheService.getLoginUserName(token);

        if (data.getNo() <= 0) {
            int no = 1;
            Optional<News> optionalNews = this.newsRepository.findFirstByWebAndCatalogOrderByNoDesc(data.getWeb(), data.getCatalog());
            if (optionalNews.isPresent()) {
                no = optionalNews.get().getNo() + 1;
            }
            data.setNo(no);
        }

        if (StringUtils.isEmpty(data.getSummary())) data.setSummary("");
        data.setPublishBy(userName);
        data.audit(userName);
        News flushNews = this.newsRepository.saveAndFlush(data);

        NewsContent newsContent;
        if (isNewData) {
            newsContent = new NewsContent();
        } else {
            Optional<NewsContent> optionalNewsContent = this.newsContentRepository.findFirstByNewsId(data.getId());
            newsContent = optionalNewsContent.orElseGet(NewsContent::new);
        }

        newsContent.setNewsId(flushNews.getId());
        newsContent.setContent(data.getContent());
        newsContent.audit(userName);
        this.newsContentRepository.save(newsContent);
    }

    @Override
    public void deleteData(String id, String token) {
        if (!sysCacheService.exists(token)) throw new RuntimeException("权限限制");

        this.newsRepository.deleteById(id);

        Optional<NewsContent> optionalNewsContent = this.newsContentRepository.findFirstByNewsId(id);
        optionalNewsContent.ifPresent(this.newsContentRepository::delete);
    }

    @Override
    public void formatNewContent(String id, String token) {
        String userName = sysCacheService.getLoginUserName(token);

        Optional<News> optionalNews = this.newsRepository.findById(id);
        if (!optionalNews.isPresent()) return;
        Optional<NewsContent> optionalNewsContent = this.newsContentRepository.findFirstByNewsId(id);
        if (!optionalNewsContent.isPresent()) return;

        News news = optionalNews.get();
        news.audit(userName);
        this.newsRepository.save(news);

        NewsContent newsContent = optionalNewsContent.get();
        newsContent.setContent(StringUtil.formatNewsContent(newsContent.getContent(),news.getLanguage()));
        newsContent.audit(userName);
        this.newsContentRepository.save(newsContent);
    }
}
