package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserRepository extends GenericRepository<SysUser> {

    List<SysUser> findAllByOrgIdOrderByCode(String orgId);

    boolean existsByCode(String code);
}
