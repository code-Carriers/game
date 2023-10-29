package com.cpoles.web.info.api.service;

import com.cpoles.web.info.api.domain.dto.GuestBookCriteria;
import com.cpoles.web.info.api.domain.entity.GuestBook;
import org.springframework.data.domain.Page;

public interface GuestBookService {

    Page<GuestBook> indexData(GuestBookCriteria criteria);

    void addData(GuestBook data, String ipAddress);

    GuestBook responseData(GuestBook data, String token);

    void deleteData(String id, String token);
}
