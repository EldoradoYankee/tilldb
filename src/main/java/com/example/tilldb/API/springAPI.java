package com.example.tilldb.API;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springAPI {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/spring",
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public String search() {
        return "{html}";
    }
}
