package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysUserToken;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SysUserTokenRepository extends GenericRepository<SysUserToken> {

    Optional<SysUserToken> findByToken(String token);
}
