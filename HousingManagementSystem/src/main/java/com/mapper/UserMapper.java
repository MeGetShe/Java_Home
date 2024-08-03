package com.mapper;


import com.pojo.User;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-03 13:59:23
 */
public interface UserMapper {

    //添加用户信息
    Integer insertUser(User user);

  

}

