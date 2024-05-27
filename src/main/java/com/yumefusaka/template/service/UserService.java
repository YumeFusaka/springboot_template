package com.yumefusaka.template.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yumefusaka.template.pojo.DTO.UserDTO;
import com.yumefusaka.template.pojo.Entity.User;

public interface UserService extends IService<User> {
    void add(UserDTO user);

    boolean login(UserDTO userDTO);
}