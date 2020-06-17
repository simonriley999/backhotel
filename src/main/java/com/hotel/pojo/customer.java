package com.hotel.pojo;
import lombok.Data;
import java.util.Date;
@Data
public class customer {
    private Integer	id;
    private String name;
    private Integer	sex;
    private String tel;
    private String email;
    private Integer	integra;
    private Integer level;
    private Date last_ctime;
    private Date last_rtime;
    private String note;
}
