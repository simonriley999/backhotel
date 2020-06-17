package com.hotel.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Consume {
    private Integer id;
    private String no;
    private String room_number;
    private String goods_name;
    private Integer number;
    private double goods_price;
    private double consume_money;
    private double discount_rate;
    private double discount_money;
    private double sum_money;
    private Integer user_id;
    private Date date;
    private String note;
}