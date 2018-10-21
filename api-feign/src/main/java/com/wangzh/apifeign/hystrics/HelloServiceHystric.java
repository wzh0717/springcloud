package com.wangzh.apifeign.hystrics;

import com.wangzh.apifeign.services.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystric implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "sorry,request error." + name;
    }
}
