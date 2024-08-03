package com.dao.impl;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public Integer save(User user) {
        System.out.println("保存了用户信息,用jdbc");
        return 1;
    }
}
