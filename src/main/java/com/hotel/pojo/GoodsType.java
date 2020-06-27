package com.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 商品类别
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsType {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 类别名称
     */
    private String name;

    /**
     * 备注
     */
    private String note;


}
