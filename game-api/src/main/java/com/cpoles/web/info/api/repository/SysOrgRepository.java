package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysOrg;
import org.springframework.stereotype.Repository;

@Repository
public interface SysOrgRepository extends GenericRepository<SysOrg> {
}
