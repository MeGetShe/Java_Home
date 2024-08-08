package com.mapper;


import com.pojo.Attence;

import java.util.List;

/**
 * (Attence)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-07 14:30:25
 */
public interface AttenceMapper {

    List<Attence> queryAll();

    Integer insertAtence(Attence attence);

  

}

