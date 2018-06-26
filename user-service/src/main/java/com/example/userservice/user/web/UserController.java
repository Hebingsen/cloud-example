package com.example.userservice.user.web;

import com.example.userservice.user.pojo.User;
import com.example.userservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对外提供用户相关API接口
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    /**
     * 根据ID查询用户信息
     *
     * @param id
     */
    @GetMapping("/info/{id}")
    public User findInfoById(@PathVariable Long id) {
        User user = userService.selectById(id);
        return user;
    }


}
