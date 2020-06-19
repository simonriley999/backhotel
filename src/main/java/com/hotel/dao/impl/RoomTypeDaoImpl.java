package com.hotel.dao.impl;

import com.hotel.dao.IRoomTypeDao;
import com.hotel.pojo.RoomType;
import com.hotel.util.JdbcUtil;

import java.sql.SQLException;
import java.util.List;

public class RoomTypeDaoImpl implements IRoomTypeDao {
    @Override
    public List<RoomType> queryRoomType() {
        String sql = "select id,name,size,note from roomtype";
        List<RoomType> list = JdbcUtil.executeQuery(sql, RoomType.class);
        return list;
    }

    @Override
    public int addRoomtype(RoomType roomType) {
        int result = JdbcUtil.executeUpdate("insert into roomtype(name,size,note) values(?,?,?)"
                ,roomType.getName(),roomType.getSize(),roomType.getNote());
        return result;
    }

    @Override
    public RoomType getByID(int id) {
        return JdbcUtil.getById("select id,name,size,note from roomtype where id=?",RoomType.class,id);
    }

    @Override
    public int updateRoomtype(RoomType roomType) {
        return JdbcUtil.executeUpdate("update roomtype set name=?,size=?,note=? where id=?",roomType.getName(),roomType.getSize(),roomType.getNote(),roomType.getId());
    }
}
