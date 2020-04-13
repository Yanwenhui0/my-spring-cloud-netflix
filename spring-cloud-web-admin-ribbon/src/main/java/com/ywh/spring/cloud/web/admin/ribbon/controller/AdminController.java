package com.ywh.spring.cloud.web.admin.ribbon.controller;

import com.ywh.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/sayHello/{message}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String message) {
        return adminService.sayHello(message);
    }

}
