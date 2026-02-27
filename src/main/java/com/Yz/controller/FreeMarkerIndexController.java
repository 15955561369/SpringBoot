package com.Yz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller//不需要写RestController，因为不返回Json数据，而是转发到模板引擎
public class FreeMarkerIndexController {
    @RequestMapping(value = "/name")
    public String getName(Map<String,Object> result){
        result.put("name","mayikt");
        result.put("age",22);
        List<String> addressList=new ArrayList<>();
        addressList.add("163.com");
        addressList.add("qq.com");
        addressList.add("npu.edu.com");
        result.put("address",addressList);
        return "FreeMarkerIndex";// 带上map中的数据转发到index
    }
}
