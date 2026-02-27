package com.Yz.controller;

import com.Yz.entity.UserEntity;
import com.Yz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {
    @Autowired //从IOC容器中自动装填
    private UserMapper userMapper;

    /**
     * 添加一个用户
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/insert")
    public String insert(String name,Integer age) {
        int i=userMapper.insert(name,age);
        return i>0?"success":"fail";
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/select/{id}")
    public UserEntity selectById(@PathVariable("id") Integer id) {
        UserEntity userEntity = userMapper.selectById(id);
        return userEntity;
    }

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/select")
    public List<UserEntity> select() {
        List<UserEntity> userEntities = userMapper.selectAll();
        return userEntities;
    }

    /**
     * 更新用户信息
     * @param id
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/update")
    public String updateUser(Integer id,String name,Integer age) {
        int update = userMapper.update(id, name, age);
        return update>0?"success":"fail";
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        int delete = userMapper.delete(id);
        return delete>0?"success":"fail";
    }
}
