package com.hotel.pojo;
import lombok.Data;
@Data
public class goods {
    private Integer	id;
    private String name;
    private Integer goods_type_id;
    private Double price;
    private String unit;
    private String note;
}
