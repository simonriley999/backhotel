package com.hotel.pojo;


import lombok.Data;

@Data
public class CheckOut {
    private Integer id;
    private String no;
    private double discount_price;
    private double deposit;
    private Integer days;
    private double hotel_cost;
    private double shop_cost;
    private double meal_cost;
    private double phone_cost;
    private double real_cost;
    private double re_deposit;
    private Integer payment_type;
    private double received_money;
    private double changex;
    private Integer user_id;
    private String note;

}
