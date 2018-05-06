package com.dddf.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DddfDao {
    List<Map<String, Object>> selectMenu();

    List<Map<String, Object>> selectMaterial(@Param("type") String type);
    void insertUser(@Param("map")Map map);

}
