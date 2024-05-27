package com.yumefusaka.template.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yumefusaka.template.mapper.UserMapper;
import com.yumefusaka.template.pojo.DTO.UserDTO;
import com.yumefusaka.template.pojo.Entity.User;
import com.yumefusaka.template.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        userMapper.insert(user);
    }

    @Override
    public boolean login(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        List<User> return_user =  userMapper.selectList(
                new QueryWrapper<User>().eq("username", user.getUsername())
                        .eq("password", user.getPassword()));
        return !return_user.isEmpty();
    }
}