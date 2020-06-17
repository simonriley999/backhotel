package com.hotel.pojo;

import lombok.Data;

@Data
public class Room {
    private Integer id;
    private String room_number;
    private Integer state;
    private double standard_price;
    private double discount_price;
    private double ncustomer_price;
    private double vcustomer_price;
    private String note;
}
