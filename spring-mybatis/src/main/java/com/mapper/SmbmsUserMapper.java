package com.mapper;


import com.pojo.SmbmsUser;

import java.util.List;

/**
 * (SmbmsUser)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-06 13:43:50
 */

public interface SmbmsUserMapper {

    List<SmbmsUser> queryAll();

}

