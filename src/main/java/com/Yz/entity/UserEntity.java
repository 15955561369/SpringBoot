package com.Yz.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data //来源于lombok插件，能够在编译java文件时自动提供get、set、toString，简化开发代码。
@Slf4j //打印日志
public class UserEntity {
    private Integer id;
    private String name;
    private Integer age;

    //无论通过json反序列化传递对象 还是将返回的对象序列化为json进行渲染，都通过无参构造方法
    public UserEntity() {

    }
    //或者通过有参构造方法，不过参数一定要写齐
    public UserEntity(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(22);
        userEntity.setName("zy");
        userEntity.setId(11);
        System.out.println(userEntity);
        log.info("日志");
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
}
