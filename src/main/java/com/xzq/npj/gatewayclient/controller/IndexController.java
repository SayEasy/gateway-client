package com.xzq.npj.gatewayclient.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/hi")
    public String hello(){
        return "hello world " ;
    }
}
