package com.dddf.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SspDao {
    List<Map<String,Object>> getSsp(@Param("ssp_adslot_id")String ssp_adslot_id);
}
