package com.example.userservice.user.mapper;

import java.util.List;

import com.example.userservice.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;


import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{

	List<User> findAll();

}
