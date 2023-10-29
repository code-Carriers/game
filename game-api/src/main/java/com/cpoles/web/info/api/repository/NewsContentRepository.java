package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.NewsContent;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NewsContentRepository extends GenericRepository<NewsContent> {

    Optional<NewsContent> findFirstByNewsId(String newsId);
}