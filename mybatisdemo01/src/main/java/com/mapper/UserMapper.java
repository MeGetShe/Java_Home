package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询用户数
    Integer queryCount();

    //查询所有用户
    List<User> queryAllUser();

    //添加用户
    Integer insertUser(User user);

    //删除用户
    Integer deleteUser(@Param("id") Long id);

    //根据用户名模糊查询来获取用户信息
    List<User> queryByName(@Param("username") String username);

    //根据用户名和角色查询用户信息
    List<User> queryByNameAndRole(User user);
    List<User> queryByNameAndRoleParam(@Param("username") String username,@Param("userrole") Integer userRole);
    List<User> queryByNameAndRoleName(@Param("username") String username,@Param("userrole") Integer userRole);

    //根据id修改用户密码
    Integer updateUserPassword(@Param("id") Long id, @Param("userpassword") String userpassword);

    //根据用户名模糊查询用户信息以及其角色信息
    List<User> queryUserAndRoleByUserName(@Param("userName") String userName);

    //动态SQL

    //根据角色id和用户名查询用户信息
    List<User> queryUserByRoleIdAndUserName(User user);

    //修改用户信息(set)
    Integer updateUserSet(User user);

    //修改用户信息(trim)
    Integer updateUserTrim(User user);

    //通过角色id查询用户信息(foreach)
    List<User> queryUserForeachArray(@Param("RoleIds") Long[] RoleIds);
    List<User> queryUserForeachMap(Map<String,Object> map);

    //根据动态用户名分页查询用户信息
}
