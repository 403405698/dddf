package com.dddf.service.impl;

import com.alibaba.fastjson.JSON;
import com.dddf.dao.SspDao;
import com.dddf.service.SspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Service
public class SspServiceImpl implements SspService {
    @Autowired
    private SspDao sspDao;


    @Override
    public String getSsp(String ssp_adslot_id) {
        List<Map<String, Object>> mapList = sspDao.getSsp(ssp_adslot_id);
        return JSON.toJSONString(mapList);
    }
}
