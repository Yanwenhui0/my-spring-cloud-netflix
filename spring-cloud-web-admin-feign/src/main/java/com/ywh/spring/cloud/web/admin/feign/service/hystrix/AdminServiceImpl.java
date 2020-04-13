package com.ywh.spring.cloud.web.admin.feign.service.hystrix;

import com.ywh.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceImpl implements AdminService {

    @Override
    public String sayHello(String message) {
        return "feign--error!!! ==>> " + message;
    }
}
