package com.halfacode.mybatis.controller;

import com.halfacode.mybatis.model.User;
import com.halfacode.mybatis.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userMapper.findAll();
    }

    @GetMapping("/update")
    public List<User> update() {

        User user = new User();
        user.setDomain("IT-SOFTWARE");
        user.setEmail("tttt@gmail.com");
        user.setExperience(8);
        user.setName("allliii");

        userMapper.insert(user);

        System.out.println("Generated ID for the new user: " + user.getId());

        return userMapper.findAll();
    }
}
