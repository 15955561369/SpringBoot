package com.Yz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ResponseBody //将返回值自动序列化为json数据
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> handleException(Exception e){
        log.info("系统出现异常："+e);
        Map<String,Object> map = new HashMap<>();
        map.put("code",500);
        map.put("msg","出现异常："+e.getMessage());
        return map;
    }
}
