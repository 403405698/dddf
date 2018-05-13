package com.dddf.service.impl;

import com.alibaba.fastjson.JSON;
import com.dddf.dao.CityDao;
import com.dddf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CityServiceImpl implements CityService {


  @Autowired
    private CityDao cityDao;

    @Override
    public String getCity(String city_code) {
        List<Map<String,Object>> mapList= cityDao.getCity(city_code);

        return JSON.toJSONString(mapList);
    }
}
