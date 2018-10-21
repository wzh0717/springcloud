package com.wangzh.apiribbon.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject(MessageFormat.format("http://service-hello/hello?name={0}", name), String.class);
    }

    public String helloError(String name) {
        return MessageFormat.format("hello {0},request error.", name);
    }
}
