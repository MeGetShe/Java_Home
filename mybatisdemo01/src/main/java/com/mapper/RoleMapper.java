package com.mapper;

import com.pojo.Role;
import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    //增加角色信息
    Integer saveRole(Role role);
    //通过id修改角色编号和名称
    Integer updateById(Role role);
    //通过id删除角色
    Integer deleteById(@Param("id") Long id);

    //通过角色名称查询角色信息
    List<Role> queryByRoleName(@Param("roleName") String roleName);
    //通过角色名称查询角色信息以及该角色的员工信息
    List<Role> queryRoleAndUserByRoleName(@Param("roleName") String roleName);

}
