package com.Yz.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//该注解能够直接读取application.yml中配置的参数，将读取出来的参数存放在该对象的属性中，这样就可以不用在Controller类中一个一个添加@Value注解了，直接通过对象访问。
@ConfigurationProperties("mayikt") //前缀mayikt
@Data //通过lombok插件自动提供get和set方法
public class PropertiesEntity {
    private String name;
    private Integer age;
    private String address;

    public PropertiesEntity() {

    }
}
