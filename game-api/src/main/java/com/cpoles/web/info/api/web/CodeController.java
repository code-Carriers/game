package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.domain.entity.CodeWeb;
import com.cpoles.web.info.api.service.CodeWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codes")
public class CodeController {

    private final CodeWebService codeWebService;

    @Autowired
    public CodeController(CodeWebService codeWebService) {
        this.codeWebService = codeWebService;
    }

    //网站代码
    @GetMapping(value = "/web")
    public List<CodeWeb> indexCodeWeb(@RequestParam("keyword") String keyword) {
        return this.codeWebService.indexData(keyword);
    }

    @GetMapping(value = "/web/auth")
    public List<CodeWeb> indexCodeWebAuth(@RequestHeader(value = "token") String token) {
        return this.codeWebService.getAuthData(token);
    }

    @GetMapping(value = "/web/{id}")
    public CodeWeb getCodeWeb(@PathVariable String id) {
        return this.codeWebService.getData(id);
    }

    @PostMapping(value = "/web")
    public CodeWeb updateCodeWeb(@RequestBody CodeWeb data,
                                 @RequestHeader(value = "token") String token) {
        return this.codeWebService.updateData(data, token);
    }

    @DeleteMapping(value = "/web/{id}")
    public void deleteCodeWeb(@PathVariable String id) {
        this.codeWebService.deleteData(id);
    }
}

