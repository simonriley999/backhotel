package com.hotel.dao.impl;

import com.hotel.dao.RoomTypeDao;
import com.hotel.pojo.Roomtype;
import com.hotel.util.JdbcUtil;

import java.util.List;

public class RoomTypeImpl implements RoomTypeDao {
    @Override
    public List<Roomtype> list() {
        return JdbcUtil.executeQuery("select id,name,size,note from roomtype",Roomtype.class);
    }

    @Override
    public int add(Roomtype roomtype) {
        return JdbcUtil.executeUpdate("insert into roomtype(name,size,note) values(?,?,?)",roomtype.getName(),roomtype.getSize(),roomtype.getNote());
    }

    @Override
    public Roomtype getById(int id) {
        return JdbcUtil.getById("select id,name,size,note from roomtype where id=?",Roomtype.class,id);
    }

    @Override
    public int update(Roomtype roomtype) {
        return JdbcUtil.executeUpdate("update roomtype set name=?,size=?,note=? where id=?",roomtype.getName(),roomtype.getSize(),roomtype.getNote(),roomtype.getId());
    }
}
