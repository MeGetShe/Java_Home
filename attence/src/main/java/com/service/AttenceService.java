package com.service;

import com.pojo.Attence;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * (Attence)表服务接口
 *
 * @author makejava
 * @since 2024-08-07 14:30:23
 */
public interface AttenceService {

    List<Attence> queryAll();

    Integer insertById(Attence attence);
   

}
