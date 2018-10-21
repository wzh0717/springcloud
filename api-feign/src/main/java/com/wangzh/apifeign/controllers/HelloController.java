package com.wangzh.apifeign.controllers;

import com.wangzh.apifeign.services.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    /*
     * bean程序启动时注入
     * */
    @Autowired
    //@Qualifier("helloService")
    private IHelloService helloService;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam(name = "name") String name) {
        return helloService.sayHello(name);
    }
}
