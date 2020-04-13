package com.ywh.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHello")
    public String sayHello(String message) {
        return restTemplate.getForObject("http://SPRING-CLOUD-SERVICE-ADMIN/sayHello/" + message, String.class);
    }

    public String errorHello(String message) {
        return "robbin--error!!! ==>> " + message;
    }

}
