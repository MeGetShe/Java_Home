package com.service.impl;

import com.dto.PageDto;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.RealEstate;
import com.mapper.RealEstateMapper;
import com.service.RealEstateService;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

import java.util.List;

/**
 * (RealEstate)表服务实现类
 *
 * @author makejava
 * @since 2024-08-03 13:59:21
 */
@Service("realEstateService")
public class RealEstateServiceImpl implements RealEstateService {
    @Resource
    private RealEstateMapper realEstateMapper;


    @Override
    public PageInfo<RealEstate> queryAll(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPageNum(),pageDto.getPageSize());
        List<RealEstate> realEstateList = realEstateMapper.queryAll();
        PageInfo<RealEstate> pageInfo = new PageInfo<>(realEstateList);
        return pageInfo;
    }

    @Override
    public PageInfo<RealEstate> queryByName(PageDto pageDto, String name) {
        PageHelper.startPage(pageDto.getPageNum(),pageDto.getPageSize());
        List<RealEstate> realEstateList = realEstateMapper.queryByName(name);
        PageInfo<RealEstate> pageInfo=new PageInfo<>(realEstateList);
        return pageInfo;
    }

    @Override
    public PageInfo<RealEstate> queryByCardId(PageDto pageDto, String cardId) {
        PageHelper.startPage(pageDto.getPageNum(),pageDto.getPageSize());
        List<RealEstate> realEstateList = realEstateMapper.queryByCarId(cardId);
        PageInfo<RealEstate> pageInfo = new PageInfo<>(realEstateList);
        return pageInfo;
    }
}
