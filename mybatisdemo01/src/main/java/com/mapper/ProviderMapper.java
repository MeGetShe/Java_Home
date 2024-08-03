package com.mapper;

import com.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderMapper {
    List<Provider> queryByProNameToPage(@Param("proName") String proName);
}
