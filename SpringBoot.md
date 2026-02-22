## SpringBoot简介
SpringBoot是一个快速开发框架，封装了Maven常用依赖，能够快速整合其他框架。  
特性：
1) 全部基于注解方式，不需要写xml配置
2) 内嵌Tomcat，不需要用到外部的Tomcat，简化启动。
3) SpringBoot的Web组件默认继承了SpringMVC框架。
### SpringBoot与SpringCloud区别
SpringCloud依赖于SpringBoot，使用SpringMVC编写Http协议接口，同时是一套完整的微服务解决框架。
### 创建SpringBoot工程
1) 创建普通的Maven工程，不需要Archetype
2) pom.xml导入依赖  
\<parent>  
   \<groupId>org.springframework.boot\</groupId>  
   \<artifactId>spring-boot-starter-parent\</artifactId>
   \<version>2.1.8.RELEASE \</version>  
   \</parent>  
   \<dependencies>  
   \<dependency>
   \<groupId>org.springframework.boot\</groupId>
   \<artifactId>spring-boot-starter-web\</artifactId>
   \</dependency>  
   \</dependencies>
3) 创建Controller包，编写控制类
### 启动方式
1) 添加启动类App，添加注解@SpringBootApplication
2) main函数中SpringApplication.run(Controller.App.class,args)
### 静态资源
开发Web应用时需要用到大量的js、css、图片等静态资源。   
文件夹命名规范：static public resources  
如放置在/resources/static下
### SpringBoot配置方式
1) yml（常用，可以减少配置文件的重复性）
2) properties
### 模板引擎
1) ThymeLeaf （主）
2) FreeMarker （主）
3) Velocity （主）
4) Groovy
5) Mustache