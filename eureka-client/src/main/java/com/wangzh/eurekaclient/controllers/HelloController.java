package com.wangzh.eurekaclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String clientPort;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {

        return "hello " + name + "，this is service hello，port：" + clientPort;
    }
}
