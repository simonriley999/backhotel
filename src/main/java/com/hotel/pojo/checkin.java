package com.hotel.pojo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

public class checkin {
    private Integer id;//自增id
    private String no;//入住单号
    private String room_number;//房号
    private Integer room_type_id;//客房类型
    private BigDecimal standard_price;//标准价
    private BigDecimal discount_price;//折后价
    private BigDecimal deposit;//押金
    private String customer_name;//入住人
    private Integer card_type;//1身份证2护照3军官证
    private String card_number;//证件号
    private String phone;//联系电话
    private Date arrive_time;//到店时间
    private Date leave_time;//离店时间
    private Integer customer_size;//入住人数
    private Integer user_id;//操作员id
    private Integer customer_id;//会员编号
    private BigDecimal customer_price;//VIP会员价
    private Integer breakfast_or_not;//1提供2不提供
    private Integer remind_or_not;//1提供2不提供
    private String note;//备注
}
