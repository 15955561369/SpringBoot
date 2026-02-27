package com.Yz.controller;

import com.Yz.entity.PropertiesEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {
    //从SpringBoot的配置文件.yml中拿值
    @Value("${mayikt.name}")
    private String name;
    @Value("${mayikt.age}")
    private int age;

    @RequestMapping("/properties")
    public String getProperties() {
        return "第一种方法，通过@Value获取参数值："
                + name + " " + age;
    }

    @Autowired
    private PropertiesEntity propertiesEntity;
    @RequestMapping("/properties02")
    public String getProperties02() {
        return "第二种方法，通过@ConfigurationProperties获取参数值："
                + propertiesEntity.getName() + " " + propertiesEntity.getAge() + " " + propertiesEntity.getAddress();
    }

    @RequestMapping("/helloworld")
    public String helloWorld() {
        log.info("Hello World");
        return "Hello World";
    }


}
