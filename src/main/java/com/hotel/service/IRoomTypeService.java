package com.hotel.service;

import com.hotel.pojo.Room;
import com.hotel.pojo.Roomtype;

import java.util.List;

public interface IRoomTypeService {
    List<Roomtype> queryRoomType() ;
    int addRoomtype(Roomtype roomType);
    Roomtype getByID(int id);
    int updateRoomtype(Roomtype roomType);
}
