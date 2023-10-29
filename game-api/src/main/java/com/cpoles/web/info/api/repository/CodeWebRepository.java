package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.CodeWeb;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CodeWebRepository extends GenericRepository<CodeWeb> {

    Optional<CodeWeb> findFirstByCode(String code);

    List<CodeWeb> findAllByOrderByCode();

    List<CodeWeb> findAllByCodeLikeOrNameLikeOrderByCode(String code, String name);
}