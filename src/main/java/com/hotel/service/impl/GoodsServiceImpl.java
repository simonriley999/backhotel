package com.hotel.service.impl;

import com.hotel.dao.GoodsDao;
import com.hotel.dao.impl.GoodsDaoImpl;
import com.hotel.pojo.Goods;
import com.hotel.service.GoodsService;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    GoodsDao goodsDao = new GoodsDaoImpl();
    @Override
    public int addGoods(Goods goods) {
        return goodsDao.addGoods(goods);
    }

    @Override
    public int deleteGoods(int id) {
        return goodsDao.deleteGoods(id);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsDao.updateGoods(goods);
    }

    @Override
    public Goods findGoods(int id) {
        return goodsDao.findGoods(id);
    }

    @Override
    public List<Goods> listGoods() {
        return goodsDao.listGoods();
    }

    @Override
    public List<Goods> fenlei(int id) {
        return goodsDao.fenlei(id);
    }
}
