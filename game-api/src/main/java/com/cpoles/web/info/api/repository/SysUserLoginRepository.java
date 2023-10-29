package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysUserLogin;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SysUserLoginRepository extends GenericRepository<SysUserLogin> {

    List<SysUserLogin> findByLoginCode(String loginCode);

    List<SysUserLogin> findByUserId(String userId);

    Optional<SysUserLogin> findByLoginCodeAndLoginType(String loginCode, String loginType);

    boolean existsByLoginCode(String loginCode);
}
