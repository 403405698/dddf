package com.dddf.service.impl;

import com.alibaba.fastjson.JSON;
import com.dddf.dao.DddfDao;
import com.dddf.service.DddfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
        List<Map<String, Object>> materialList = dddfDao.selectMaterial(type);
        return JSON.toJSONString(materialList);
    }

    @Override
    public void insertUser(Map map) {
        //实现
        dddfDao.insertUser(map);
    }

    /**
     * 根据城市code查询订单
     *
     * @param city_code
     * @return
     */
    @Override
    public String selectOrder(String city_code) {
        String orders = null;//接受查询 的消息
        if (city_code != null && city_code != "") { //如果传送的参数city_code不为空，那么执行语句里面的代码
            orders = JSON.toJSONString(dddfDao.selectOrder(city_code));
        }
        return orders;//查询的结果返回给请求
    }

    @Override
    public String getOrder(String orderid) {

        List<Map<String, Object>> orderList = dddfDao.getOrder(orderid);
        Map<String, List<Map<String, Object>>> objectMap = new HashMap<>();
        if (orderList != null && orderList.size() > 0) {
            int orderListSize = orderList.size();
            for (int i = 0; i < orderListSize; i++) {
                String key = orderList.get(i).remove("orderid").toString();
                Map<String, Object> valueMap = orderList.get(i);
                if (objectMap != null && objectMap.get(key) != null) {
                    objectMap.get(key).add(valueMap);

                } else {
                    List<Map<String, Object>> mapList = new ArrayList<>();
                    mapList.add(valueMap);
                    objectMap.put(key, mapList);
                }
            }
        }
        return JSON.toJSONString(objectMap);
    }
}
