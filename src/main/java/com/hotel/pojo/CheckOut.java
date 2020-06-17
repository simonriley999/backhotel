package com.hotel.pojo;


import lombok.Data;

@Data
public class CheckOut {
    private Integer id;
    //入住单号
    private String no;
    //房价
    private double discount_price;
    //押金
    private double deposit;
    //天数
    private Integer days;
    //住宿费
    private double hotel_cost;
    //店内消费
    private double shop_cost;
    //餐费
    private double meal_cost;
    //电话费
    private double phone_cost;
    //实际应收
    private double real_cost;
    //应退押金
    private double re_deposit;
    //付款方式   1现金2在线3刷卡
    private Integer payment_type;
    //实收
    private double received_money;
    //找零
    private double changex;
    //操作员id
    private Integer user_id;
    //备注
    private String note;

}
