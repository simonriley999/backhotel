package test;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.Checkin;
import com.hotel.pojo.Goods;
import com.hotel.pojo.Roomtype;
import com.hotel.pojo.User;
import com.hotel.service.ConsumeService;
import com.hotel.service.GoodsService;
import com.hotel.service.RoomTypeService;
import com.hotel.service.impl.ConsumeServiceImpl;
import com.hotel.service.impl.GoodsServiceImpl;
import com.hotel.service.impl.RoomTypeServiceImpl;

import java.util.List;

public class HotelTest {
    public static void main(String[] args) {
        ConsumeService consumeService = new ConsumeServiceImpl();
        String roomNumber = "203";
        Checkin checkin = consumeService.findCheckin(roomNumber);
        System.out.println(checkin);
        GoodsService goodsService = new GoodsServiceImpl();
        List<Goods> list = goodsService.fenlei(1);
        System.out.println(list);
    }
}
