package com.hotel.pojo;

import lombok.Data;

@Data
public class RoomType {
    private Integer	id;//自增id
    private String name;//客房名称
    private Integer	size;//额定人数
    private String note;//备注

}
