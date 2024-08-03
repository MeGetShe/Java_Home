package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.User;

import java.util.List;

public interface UserService {

    List<User> queryAll();

    PageInfo<User> queryUserPage(Integer pageNo, Integer pageSize);
}
