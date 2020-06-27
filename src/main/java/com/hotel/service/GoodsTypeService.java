package com.hotel.service;

import com.hotel.pojo.GoodsType;
import com.hotel.pojo.Roomtype;

import java.util.List;

public interface GoodsTypeService {
    List<GoodsType> list();
    int add(GoodsType goodsType);
    GoodsType getById(int id);
    int update(GoodsType goodsType);
    int delete(int id);
}
