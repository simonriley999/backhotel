package com.hotel.dao.impl;

import com.hotel.dao.ConsumeDao;
import com.hotel.pojo.Checkin;
import com.hotel.pojo.Consume;
import com.hotel.pojo.User;
import com.hotel.util.JdbcUtil;

import java.util.List;

public class ConsumeDaoImpl implements ConsumeDao {
    @Override
    public int add(Consume consume) {
        return JdbcUtil.executeUpdate("insert into consume(no,room_number,goods_name,number,goods_price,consume_money,discount_rate,discount_money,sum_money,user_id,date,note) values(?,?,?,?,?,?,?,?,?,?,?,?)",consume.getNo(),consume.getRoomNumber(),consume.getGoodsName(),consume.getNumber(),consume.getGoodsPrice(),consume.getConsumeMoney(),consume.getDiscountRate(),consume.getDiscountRate(),consume.getSumMoney(),consume.getUserId(),consume.getDate(),consume.getNote());
    }

    @Override
    public int delete(int id) {
        return JdbcUtil.executeUpdate("delete from consume where id = ?",id);
    }

    @Override
    public int update(Consume consume) {
        return JdbcUtil.executeUpdate("update consume set no = ?,room_number = ?,goods_name = ?,number = ?,goods_price = ?,consume_money = ?,discount_rate = ?,discount_money = ?,sum_money = ?,user_id = ?,date = ?,note = ? where id = ?",consume.getNo(),consume.getRoomNumber(),consume.getGoodsName(),consume.getNumber(),consume.getGoodsPrice(),consume.getConsumeMoney(),consume.getDiscountRate(),consume.getDiscountRate(),consume.getSumMoney(),consume.getUserId(),consume.getDate(),consume.getNote(),consume.getId());
    }

    @Override
    public Consume findById(int id) {
        return JdbcUtil.getById("select id,no,room_number as roomNumber,goods_name as goodsName,number,goods_price as goodsPrice,consume_money as consumeMoney,discount_rate as discountRate,discount_money as discountMoney,sum_money as sumMoney,user_id as userId,date,note from consume where id = ?",Consume.class,id);
    }

    @Override
    public List<Consume> list() {
        return JdbcUtil.executeQuery("select id,no,room_number as roomNumber,goods_name as goodsName,number,goods_price as goodsPrice,consume_money as consumeMoney,discount_rate as discountRate,discount_money as discountMoney,sum_money as sumMoney,user_id as userId,date,note from consume",Consume.class);
    }

    @Override
    public Checkin findCheck(String roomNumber) {
        return JdbcUtil.getById("select id,no,room_number as roomNumber,room_type_id as roomTypeId,standard_price as standardPrice,discount_price as discountPrice,deposit,customer_name as customerName,card_type as cardType,card_number as cardNumber,phone,arrive_time as arriveTime,leave_time as leaveTime,customer_size as customerSize,user_id as userId,customer_id as customerId,customer_price as customerPrice,breakfast_or_not as breakfastOrNot,remind_or_not as remindOrNot,note from checkin where room_number = ?",Checkin.class,roomNumber);
    }

}
