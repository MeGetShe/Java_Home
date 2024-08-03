package com.service.impl;

import com.pojo.User;
import com.mapper.UserMapper;
import com.service.UserService;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

import java.util.Date;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2024-08-03 13:59:23
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public Integer insertUser(User user) {
        Integer count = userMapper.insertUser(user);
        return count;
    }
}
