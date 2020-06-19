package test;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.Roomtype;
import com.hotel.service.RoomTypeService;
import com.hotel.service.impl.RoomTypeServiceImpl;

import java.util.List;

public class HotelTest {
    public static void main(String[] args) {
        RoomTypeService roomTypeService = new RoomTypeServiceImpl();
        List<Roomtype> list = roomTypeService.list();
        String str = JSONObject.toJSONString(list);
        System.out.println(str);
    }
}
