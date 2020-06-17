package com.hotel.pojo;

import lombok.Data;

@Data
public class Room {
    private Integer id;
    //房号
    private String room_number;
    //状态 1入住 2空闲 3预定
    private Integer state;
    //标准价
    private double standard_price;
    //折后价
    private double discount_price;
    //普通会员价
    private double ncustomer_price;
    //VIP会员价
    private double vcustomer_price;
    //备注
    private String note;
}
