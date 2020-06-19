package com.hotel.service.impl;

import com.hotel.dao.RoomTypeDao;
import com.hotel.dao.impl.RoomTypeImpl;
import com.hotel.pojo.Roomtype;
import com.hotel.service.RoomTypeService;

import java.util.List;

public class RoomTypeServiceImpl implements RoomTypeService {
    RoomTypeDao roomTypeDao = new RoomTypeImpl();
    @Override
    public List<Roomtype> list() {
        return roomTypeDao.list();
    }

    @Override
    public int add(Roomtype roomtype) {
        return roomTypeDao.add(roomtype);
    }

    @Override
    public Roomtype getById(int id) {
        return roomTypeDao.getById(id);
    }

    @Override
    public int update(Roomtype roomtype) {
        return roomTypeDao.update(roomtype);
    }
}
