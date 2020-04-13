package com.ywh.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/sayHello/{message}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String message) {
        return "Hello," + message + ",This is::" + port;
    }

    @GetMapping
    public String hello(){
        return "200";
    }

}
