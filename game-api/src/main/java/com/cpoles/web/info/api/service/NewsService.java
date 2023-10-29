package com.cpoles.web.info.api.service;

import com.cpoles.web.info.api.domain.dto.NewsCriteria;
import com.cpoles.web.info.api.domain.entity.News;
import org.springframework.data.domain.Page;

public interface NewsService {

    Page<News> indexData(NewsCriteria criteria);

    News getData(String id);

    void updateData(News data, String token);

    void deleteData(String id, String token);

    void formatNewContent(String id, String token);
}
