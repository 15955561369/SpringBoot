package com.Yz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller//不需要写RestController，因为不返回Json数据，而是进行转发
public class FreeMarkerIndexController {
    @RequestMapping("/name")
    public String getName(Map<String,String> map){
        map.put("name","mayikt");
        return "FreeMarkerIndex";// 带上map中的数据转发到index
    }
}
