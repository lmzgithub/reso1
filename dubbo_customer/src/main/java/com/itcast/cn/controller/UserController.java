package com.itcast.cn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itcast.cn.dao.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class UserController {
    @Reference
    private HelloService service;

    @RequestMapping("sayHello")
    @ResponseBody
    public String syaHello(String name) {
        return service.sayHEllo(name);
    }
}
