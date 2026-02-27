package com.Yz.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;


/**
 * 定义切面：应用通知的过程
 */
@Aspect //引入AspectJ框架
@Component
@Slf4j
public class WebLogAspect {


    @Pointcut("execution(* com.Yz.controller.*.*(..))")  //切入点表达式
    public void webLog() {
    }

    @Before("webLog()") //前置通知
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        Enumeration<String> enu = request.getParameterNames();
        //System.out.println("前置通知");
        while (enu.hasMoreElements()) {
            String name = (String) enu.nextElement();
            log.info("(Params) Key:{},Value:{}", name, request.getParameter(name));
        }
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()") //返回通知
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.info("Response : " + ret);
        //System.out.println("返回通知");
    }
}
