package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysUserLog;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserLogRepository extends GenericRepository<SysUserLog> {
}

