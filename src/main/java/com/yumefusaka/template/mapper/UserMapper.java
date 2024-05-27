package com.yumefusaka.template.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yumefusaka.template.pojo.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}