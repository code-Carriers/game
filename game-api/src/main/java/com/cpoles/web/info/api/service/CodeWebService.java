package com.cpoles.web.info.api.service;

import com.cpoles.web.info.api.domain.entity.CodeWeb;

import java.util.List;

public interface CodeWebService {

    List<CodeWeb> indexData(String keyword);

    List<CodeWeb> getAuthData(String token);

    CodeWeb getData(String id);

    CodeWeb updateData(CodeWeb data, String token);

    void deleteData(String id);
}
