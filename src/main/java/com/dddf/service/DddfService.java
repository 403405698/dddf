package com.dddf.service;


import java.util.List;
import java.util.Map;

public interface DddfService {
    String hello();

    String selectMaterial(String type);

    void insertUser(Map map);

    String selectOrder(String city_code);
}
/*
 * public interface Ddd{
 * String hello();
 * }
 *
 *
 *
 *
 *
 * */