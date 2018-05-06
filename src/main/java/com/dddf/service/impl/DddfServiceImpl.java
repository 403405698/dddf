package com.dddf.service.impl;

import com.alibaba.fastjson.JSON;
import com.dddf.dao.DddfDao;
import com.dddf.service.DddfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DddfServiceImpl implements DddfService {
    @Autowired
    private DddfDao dddfDao;

    @Override
    public String hello() {
        List<Map<String, Object>> menuList = dddfDao.selectMenu();

        return JSON.toJSONString(menuList);
    }

    @Override
    public String selectMaterial(String type) {
       List<Map<String,Object>> materialList = dddfDao.selectMaterial(type);
        return JSON.toJSONString(materialList);
    }

    @Override
    public void insertUser(Map map) {
        //实现
        dddfDao.insertUser(map);
    }
}
