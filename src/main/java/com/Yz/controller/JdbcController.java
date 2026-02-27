package com.Yz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {

    @Autowired //从IOC容器中自动注入
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/jdbc")
    public String getJdbc(String name,Integer age){
        int i = jdbcTemplate.update("insert into users values(null,?,?)", name, age);//防止注入攻击，返回受影响行数
        System.out.println(jdbcTemplate.queryForList("select * from users"));
        return i>0?"success":"fail";
    }
}

