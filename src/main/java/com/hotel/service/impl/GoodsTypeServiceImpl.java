package com.hotel.service.impl;

import com.hotel.dao.GoodsTypeDao;
import com.hotel.dao.impl.GoodsTypeDaoImpl;
import com.hotel.pojo.GoodsType;
import com.hotel.pojo.Roomtype;
import com.hotel.service.GoodsTypeService;

import java.util.List;

public class GoodsTypeServiceImpl implements GoodsTypeService {
    GoodsTypeDao goodsTypeDao =new GoodsTypeDaoImpl();
    @Override
    public List<GoodsType> list() {
        return goodsTypeDao.list();
    }

    @Override
    public int add(GoodsType goodsType) {
        return goodsTypeDao.add(goodsType);
    }

    @Override
    public GoodsType getById(int id) {
        return goodsTypeDao.getById(id);
    }

    @Override
    public int update(GoodsType goodsType) {
        return goodsTypeDao.update(goodsType);
    }

    @Override
    public int delete(int id) {
        return goodsTypeDao.delete(id);
    }


}
