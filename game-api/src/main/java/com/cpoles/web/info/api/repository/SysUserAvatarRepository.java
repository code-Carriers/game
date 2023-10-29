package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.SysUserAvatar;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SysUserAvatarRepository extends GenericRepository<SysUserAvatar> {

    List<SysUserAvatar> findByUserId(String userId);

    Optional<SysUserAvatar> findFirstByUserIdOrderByCreatedDtDesc(String userId);
}
