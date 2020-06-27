package com.hotel.dao;

import com.hotel.pojo.Roomtype;

import java.util.List;

public interface RoomTypeDao {
    List<Roomtype> list();
    int add(Roomtype roomtype);
    Roomtype getById(int id);
    int update(Roomtype roomtype);
}
