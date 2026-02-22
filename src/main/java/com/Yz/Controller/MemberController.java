package com.Yz.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MemberController {
    @RequestMapping("/getMember")
    public String getMember(){
        return "getMember";
    }

}
