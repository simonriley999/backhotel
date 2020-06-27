package com.hotel.service;

import com.hotel.pojo.Checkin;
import com.hotel.pojo.Consume;
import com.hotel.pojo.User;

import java.util.List;

public interface ConsumeService {
    int add(Consume consume);
    int delete(int id);
    int update(Consume consume);
    Consume findById(int id);
    List<Consume> list();
    Checkin findCheckin(String roomNumber);
}
