## SpringBoot简介
SpringBoot是一个快速开发框架，封装了Maven常用依赖，能够快速整合其他框架。  
特性：
1) 全部基于注解方式，不需要写xml配置
2) 内嵌Tomcat，不需要用到外部的Tomcat，简化启动。
3) SpringBoot的Web组件默认继承了SpringMVC框架。
### SpringBoot与SpringCloud区别
SpringCloud依赖于SpringBoot，使用SpringMVC编写Http协议接口，同时是一套完整的微服务解决框架。
### 创建SpringBoot工程
（1） 创建普通的Maven工程，不需要Archetype  
（2） pom.xml导入依赖  

       <parent>  
       <groupId>org.springframework.boot</groupId>  
       <artifactId>spring-boot-starter-parent</artifactId>
       <version>2.1.8.RELEASE </version>  
       </parent>  
       <dependencies>  
       <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-web</artifactId>
       </dependency>  
       </dependencies>
（3） 创建Controller包，编写控制类
### 启动方式
1) 添加启动类App，添加注解@SpringBootApplication
2) main函数中SpringApplication.run(Controller.App.class,args)
### 静态资源
开发Web应用时需要用到大量的js、css、图片等静态资源。   
文件夹命名规范：static public resources  
如放置在/resources/static下
### SpringBoot配置方式
1) properties
2) yml（常用，写法更简洁）
- .yml又有bootstrap和application两种命名，二者都可以配置参数，但bootstrap会先于application加载，bootstrap用于系统级别的配置，一旦被加载，内容不会被覆盖；
而application用于应用层面配置。
#### 多环境整合
在application.yml中根据情况激活不同的环境配置
1) application-dev.yml 开发环境
2) application-test.yml 测试环境
3) application-prd.yml 生产环境
### 模板引擎
1) ThymeLeaf （主）
2) FreeMarker （主）
3) Velocity （主）
4) Groovy
5) Mustache
### 集成lombok插件让代码更简洁
下载该插件并引入依赖后，在实体层entity类上加上@Data注解，能够自动生成Getter、Setter、toString方法
### 日志管理
SpringBoot默认集成了logback，将日志保存在项目路径的log文件夹下。  
先引入maven依赖 lombok，然后配置logback.xml，最后在application中指定读取logback配置文件。
#### 结合AOP实现打印日志
实际开发中，经常结合AOP实现方法前后打印日志。  
（1） pom.xml中新增依赖

    <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
    </dependency>
（2） 添加AOP切面配置
### 添加定时任务
（1） 创建定时任务类ScheduledTasks  
（2） 启动类App中添加注解@EnableScheduling，启用定时任务配置