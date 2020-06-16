package test;

import com.hotel.pojo.CheckOut;
import com.hotel.pojo.RoomType;

public class MyTest {
    public static void main(String[] args) {
        RoomType roomType = new RoomType();
        CheckOut c = new CheckOut();
        System.out.println(roomType.getId());
        System.out.println(c.getId());
    }
}
