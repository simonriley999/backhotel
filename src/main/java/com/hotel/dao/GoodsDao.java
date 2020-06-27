package com.hotel.dao;

import com.hotel.pojo.Goods;

import java.util.List;

public interface GoodsDao {
    int addGoods(Goods goods);
    int deleteGoods(int id);
    int updateGoods(Goods goods);
    Goods findGoods(int id);
    List<Goods> listGoods();
    List<Goods> fenlei(int id);
}
