package com.hotel.service;

import com.hotel.pojo.Room;
import com.hotel.pojo.Roomtype;

import java.util.List;

public interface RoomTypeService {
    List<Roomtype> list();
    int add(Roomtype roomtype);
    Roomtype getById(int id);
    int update(Roomtype roomtype);
}
