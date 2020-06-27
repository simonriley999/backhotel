package com.hotel.dao;

import com.hotel.pojo.GoodsType;

import java.util.List;

public interface GoodsTypeDao {
    List<GoodsType> list();
    int add(GoodsType goodsType);
    GoodsType getById(int id);
    int update(GoodsType goodsType);
    int delete(int id);
}
