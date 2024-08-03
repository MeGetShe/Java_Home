package com.service;

import com.dto.PageDto;
import com.github.pagehelper.PageInfo;
import com.pojo.RealEstate;


/**
 * (RealEstate)表服务接口
 *
 * @author makejava
 * @since 2024-08-03 13:59:20
 */
public interface RealEstateService {

    PageInfo<RealEstate> queryAll(PageDto pageDto);

    PageInfo<RealEstate> queryByName(PageDto pageDto,String name);

    PageInfo<RealEstate> queryByCardId(PageDto pageDto,String cardId);

}
