package com.dddf.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AppDao {
    List<Map<String, Object>> getApp(@Param("third_appsid") String third_appsid);

}
