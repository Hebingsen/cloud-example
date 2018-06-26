package com.example.userservice.user.service;

import com.example.userservice.user.mapper.UserMapper;
import com.example.userservice.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
