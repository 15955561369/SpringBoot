package com.Yz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
public class App {
    /*
    * 注解@SpringBootApplication：内含了@EnableAutoConfiguration和@ComponentScan注解
    * @EnableAutoConfiguration 这个注解告诉SpringBoot根据添加的依赖猜测你想如何配置Spring。由于spring-boot-starter-web添加了Tomcat和SpringMVC，所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置
    * @ComponentScan IOC容器的扫包范围，需要将所有的控制类扫进去，内部设置默认扫描同级包及子包
    * */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
