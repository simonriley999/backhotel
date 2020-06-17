package com.hotel.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Log {
    private Integer id;
    private Integer user_id;
    private String operation;
    private String password;
    private Date time;
    private String note;
}