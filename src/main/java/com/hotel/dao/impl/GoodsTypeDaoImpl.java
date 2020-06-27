package com.hotel.dao.impl;

import com.hotel.dao.GoodsTypeDao;
import com.hotel.pojo.GoodsType;
import com.hotel.pojo.Roomtype;
import com.hotel.util.JdbcUtil;

import java.util.List;

public class GoodsTypeDaoImpl implements GoodsTypeDao {

    @Override
    public List<GoodsType> list() {
        return JdbcUtil.executeQuery("select id,name,note from goods_type",GoodsType.class);
    }

    @Override
    public int add(GoodsType goodsType) {
        return JdbcUtil.executeUpdate("insert into goods_type (name,note) values (?,?)",goodsType.getName(),goodsType.getNote());
    }

    @Override
    public GoodsType getById(int id) {

        return JdbcUtil.getById("select id,name,note from goods_type where id = ?",GoodsType.class,id);
    }

    @Override
    public int update(GoodsType goodsType) {

        return JdbcUtil.executeUpdate("update goods_type set name = ?,note = ? where id=?",goodsType.getName(),goodsType.getNote(),goodsType.getId());
    }

    @Override
    public int delete(int id) {
        return JdbcUtil.executeUpdate("delete from goods_type where id = ?",id);
    }
}
