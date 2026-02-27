package com.Yz.mapper;

import com.Yz.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Mybatis映射，基于注解方式
 */
public interface UserMapper {
    @Insert("insert into users values(null,#{userName},#{age})")
    int insert(@Param("userName") String username, @Param("age") Integer age);

    @Select("select * from users")
    List<UserEntity> selectAll();

    @Select("select * from users where id=#{id}")
    UserEntity selectById(@Param("id") Integer id);

    @Update("UPDATE `springboot`.`users` SET `name` = #{name}, `age` = #{age} WHERE `id` = #{id}")
    int update(@Param("id") Integer id, @Param("name") String name, @Param("age") Integer age);

    @Delete("delete from users where id=#{id}")
    int delete(@Param("id") Integer id);
}
