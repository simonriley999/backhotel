package com.hotel.dao;

import com.hotel.pojo.Roomtype;

import java.util.List;

public interface IRoomTypeDao {
    List<Roomtype> queryRoomType() ;
    int addRoomtype(Roomtype roomType);
    Roomtype getByID(int id);
    int updateRoomtype(Roomtype roomType);
}
