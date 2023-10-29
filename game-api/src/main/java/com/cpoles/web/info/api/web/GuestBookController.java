package com.cpoles.web.info.api.web;

import com.cpoles.web.info.api.domain.dto.GuestBookCriteria;
import com.cpoles.web.info.api.domain.entity.GuestBook;
import com.cpoles.web.info.api.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/guest_books")
public class GuestBookController {

    private final GuestBookService guestBookService;

    @Autowired
    public GuestBookController(GuestBookService guestBookService) {
        this.guestBookService = guestBookService;
    }

    @PostMapping(value = "/index")
    public Page<GuestBook> indexData(@RequestBody GuestBookCriteria criteria) {
        return this.guestBookService.indexData(criteria);
    }

    @PostMapping
    public void addData(@RequestBody GuestBook data,
                        HttpServletRequest request) {
        this.guestBookService.addData(data, request.getRemoteAddr());
    }

    @PostMapping(value = "/response")
    public GuestBook responseData(@RequestBody GuestBook data,
                                  @RequestHeader(value = "token") String token) {
        return this.guestBookService.responseData(data, token);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteData(@PathVariable String id,
                           @RequestHeader(value = "token") String token) {
        this.guestBookService.deleteData(id, token);
    }
}
