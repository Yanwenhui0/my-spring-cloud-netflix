package com.ywh.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "spring-cloud-service-admin", fallback = com.ywh.spring.cloud.web.admin.feign.service.hystrix.AdminServiceImpl.class)
public interface AdminService {

    @RequestMapping(value = "/sayHello/{message}")
    String sayHello(@PathVariable String message);
}
