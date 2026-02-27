package com.Yz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @RequestMapping("/getMember")
    public String getMember(){
        return "getMember";
    }

    @RequestMapping("/aop") //测试AOP进行方法增强，即打印日志。
    public String aop(String uname,Integer age){
        return "aop";
    }
}
