package com.dddf.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CityDao {
    List<Map<String, Object>> getCity(@Param("code") String code);
}
