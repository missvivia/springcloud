package com.store.profile.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zengpeng on 2018/8/23.
 */
@RestController
@RequestMapping(path = "/")
public class Healthz {
    @GetMapping(path = "/healthz", produces = MediaType.TEXT_PLAIN_VALUE)
    public String healthz() {
        return "ok";
    }
}
