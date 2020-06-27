package com.hotel.dao.impl;

import com.hotel.dao.GoodsDao;
import com.hotel.pojo.Goods;
import com.hotel.util.JdbcUtil;

import java.util.List;

public class GoodsDaoImpl implements GoodsDao {
    @Override
    public int addGoods(Goods goods) {
        return JdbcUtil.executeUpdate("insert into goods(name,goods_type_id,price,unit,note) values(?,?,?,?,?)",goods.getName(),goods.getGoodsTypeId(),goods.getPrice(),goods.getUnit(),goods.getNote());
    }

    @Override
    public int deleteGoods(int id) {
        return JdbcUtil.executeUpdate("delete from goods where id=?",id);
    }

    @Override
    public int updateGoods(Goods goods) {
        return JdbcUtil.executeUpdate("update goods set name = ?,goods_type_id = ?,price = ?,unit = ?,note = ? where id = ?",goods.getName(),goods.getGoodsTypeId(),goods.getPrice(),goods.getUnit(),goods.getNote(), goods.getId());
    }

    @Override
    public Goods findGoods(int id) {
        return JdbcUtil.getById("select id,name,goods_type_id as goodsTypeId,price,unit,note from goods where id=?",Goods.class,id);
    }

    @Override
    public List<Goods> listGoods() {
        return JdbcUtil.executeQuery("select id,name,goods_type_id as goodsTypeId,price,unit,note from goods",Goods.class);
    }

    @Override
    public List<Goods> fenlei(int id) {
        return JdbcUtil.executeQuery("select id,name,goods_type_id as goodsTypeId,price,unit,note from goods Where goods_type_id=?",Goods.class,id);
    }
}
