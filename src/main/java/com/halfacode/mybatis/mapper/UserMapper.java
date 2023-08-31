package com.halfacode.mybatis.mapper;

import com.halfacode.mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user_reg_tbl")
    List<User> findAll();


    @Insert("insert into user_reg_tbl(name, email, experience, domain) " +
            "values(#{name}, #{email}, #{experience}, #{domain})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    void insert(User user);
}
