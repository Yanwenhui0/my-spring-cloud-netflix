package com.ywh.spring.cloud.web.admin.feign.controller;

import com.ywh.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/sayHello/{message}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String message) {
        return adminService.sayHello(message);
    }

}
