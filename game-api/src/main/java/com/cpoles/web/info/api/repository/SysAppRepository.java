package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysApp;
import org.springframework.stereotype.Repository;

@Repository
public interface SysAppRepository extends GenericRepository<SysApp> {

}
