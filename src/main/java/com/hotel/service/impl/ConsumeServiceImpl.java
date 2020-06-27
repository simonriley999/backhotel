package com.hotel.service.impl;

import com.hotel.dao.ConsumeDao;
import com.hotel.dao.impl.ConsumeDaoImpl;
import com.hotel.pojo.Checkin;
import com.hotel.pojo.Consume;
import com.hotel.pojo.User;
import com.hotel.service.ConsumeService;

import java.util.List;

public class ConsumeServiceImpl implements ConsumeService {
    ConsumeDao consumeDao = new ConsumeDaoImpl();
    @Override
    public int add(Consume consume) {
        return consumeDao.add(consume);
    }

    @Override
    public int delete(int id) {
        return consumeDao.delete(id);
    }

    @Override
    public int update(Consume consume) {
        return consumeDao.update(consume);
    }

    @Override
    public Consume findById(int id) {
        return consumeDao.findById(id);
    }

    @Override
    public List<Consume> list() {
        return consumeDao.list();
    }

    @Override
    public Checkin findCheckin(String roomNumber) {
        return consumeDao.findCheck(roomNumber);
    }

}
