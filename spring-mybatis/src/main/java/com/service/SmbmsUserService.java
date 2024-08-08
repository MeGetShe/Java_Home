package com.service;

import com.pojo.SmbmsUser;

import java.util.List;


/**
 * (SmbmsUser)表服务接口
 *
 * @author makejava
 * @since 2024-08-06 13:43:50
 */
public interface SmbmsUserService {

   List<SmbmsUser> queryAll();
   
   
   SmbmsUser login(SmbmsUser smbmsUser);

}
