package com.wangzh.apifeign.services;

import com.wangzh.apifeign.hystrics.HelloServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/* *
 * @param name
 */
@FeignClient(value = "service-hello", fallback = HelloServiceHystric.class)
@Service
public interface IHelloService {
    @GetMapping(value = "/hello")
    String sayHello(@RequestParam(value = "name") String name);
}
