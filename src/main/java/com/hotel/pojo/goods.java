package com.hotel.pojo;
import lombok.Data;
import java.math.BigDecimal;
@Data
public class goods {
    private Integer	id;
    private String name;
    private Integer goods_type_id;
    private BigDecimal price;
    private String unit;
    private String note;
}
