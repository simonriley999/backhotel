package com.hotel.pojo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
/**
 * <p>
 * 入住登记
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Checkin {

    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 入住单号
     */
    private String no;

    /**
     * 房号
     */
    private String room_number;

    /**
     * 客房类型
     */
    private Integer room_type_id;

    /**
     * 标准价
     */
    private BigDecimal standard_price;

    /**
     * 折后价
     */
    private BigDecimal discount_price;

    /**
     * 押金
     */
    private BigDecimal deposit;

    /**
     * 入住人
     */
    private String customer_name;

    /**
     * 1身份证2护照3军官证
     */
    private Integer card_type;

    /**
     * 证件号
     */
    private String card_number;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 到店时间
     */
    private Date arrive_time;

    /**
     * 离店时间
     */
    private Date leave_time;

    /**
     * 入住人数
     */
    private Integer customer_size;

    /**
     * 操作员id
     */
    private Integer user_id;

    /**
     * 会员编号
     */
    private Integer customer_id;

    /**
     * 会员价格
     */
    private BigDecimal customer_price;

    /**
     * 1提供 0不提供
     */
    private Integer breakfast_or_not;

    /**
     * 1提供 0不提供
     */
    private Integer remind_or_not;

    /**
     * 备注
     */
    private String note;


}
