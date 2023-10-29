package com.cpoles.web.info.api.repository;

import com.cpoles.framework.jpa.repository.GenericRepository;
import com.cpoles.web.info.api.domain.entity.GuestBook;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface GuestBookRepository extends GenericRepository<GuestBook> {

    Boolean existsByIpAddressAndCreatedDtAfter(String ipAddress, LocalDateTime createdDt);
}