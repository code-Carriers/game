package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.domain.dto.NewsCriteria;
import com.cpoles.web.info.api.domain.entity.News;
import com.cpoles.web.info.api.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping(value = "index")
    public Page<News> indexData(@RequestBody NewsCriteria criteria) {
        return this.newsService.indexData(criteria);
    }

    @GetMapping(value = "{id}")
    public News getData(@PathVariable String id) {
        return this.newsService.getData(id);
    }

    @PostMapping()
    public void updateData(@RequestBody News data,
                           @RequestHeader(value = "token") String token) {
        this.newsService.updateData(data, token);
    }

    @DeleteMapping(value = "{id}")
    public void deleteData(@PathVariable String id,
                           @RequestHeader(value = "token") String token) {
        this.newsService.deleteData(id, token);
    }

    @GetMapping(value = "/format")
    public void formatNewContent(@Param(value = "id") String id,
                                 @RequestHeader(value = "token") String token) {
        this.newsService.formatNewContent(id, token);
    }
}
