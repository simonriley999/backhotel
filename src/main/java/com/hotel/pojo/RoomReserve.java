package com.hotel.pojo;

import java.util.Date;

public class RoomReserve {
    private Integer id;
    //预定单号
    private String no;
    //房间号
    private String room_number;
    //客房类型
    private Integer room_type_id;
    //标准件
    private double standard_price;
    //折后价
    private double discount_price;
    //押金
    private double deposit;
    //预订人
    private String customer_name;
    //证件类型  1身份证2护照3军官证
    private Integer card_type;
    //证件号
    private String card_number;
    //联系电话
    private String phone;
    //到店时间
    private Date arrive_time;
    //离店时间
    private Date leave_time;
    //入住人数
    private  Integer customer_size;
    //操作员id
    private  Integer user_id;
    //会员编号
    private  Integer customer_id;

}
