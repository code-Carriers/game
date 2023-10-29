package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysOrgApiAuth;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysOrgApiAuthRepository extends GenericRepository<SysOrgApiAuth> {

    List<SysOrgApiAuth> findByAppKeyAndAppSecurity(String appKey, String appSecurity);
}
