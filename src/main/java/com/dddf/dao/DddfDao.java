package com.dddf.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DddfDao {
    List<Map<String, Object>> selectMenu();

    List<Map<String, Object>> selectMaterial(@Param("type") String type);
    void insertUser(@Param("map")Map map);

    /**
     * 根据城市code查新订单
     * @param city_code
     * @return
     */
    List<Map<String, Object>> selectOrder(@Param("city_code") String city_code);

}



/*
* public interface DddfDao {
    List<Map<String, Object>> selectMenu();

    List<Map<String, Object>> selectMaterial(@Param("type") String type);
    void insertUser(@Param("map")Map map);

}









public interface DddfDao {
    List<Map<String, Object>> selectMenu();

    List<Map<String, Object>> selectMaterial(@Param("type") String type);
    void insertUser(@Param("map")Map map);

}


*
* */








/*
* public interface DddfDao {
    List<Map<String, Object>> selectMenu();

    List<Map<String, Object>> selectMaterial(@Param("type") String type);
    void insertUser(@Param("map")Map map);

}

* */