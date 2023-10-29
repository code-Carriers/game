package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysMenuRepository extends GenericRepository<SysMenu> {

    List<SysMenu> findByAppIdAndEnabled(String appId, boolean enabled);

    List<SysMenu> findByAppIdAndEnabledAndChecked(String appId, boolean enabled, boolean checked);
}
