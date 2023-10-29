package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.News;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NewsRepository extends GenericRepository<News> {

    Optional<News> findFirstByWebAndCatalogOrderByNoDesc(String web, String catalog);
}