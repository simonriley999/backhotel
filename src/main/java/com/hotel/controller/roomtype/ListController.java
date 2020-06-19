package com.hotel.controller.roomtype;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.Roomtype;
import com.hotel.service.RoomTypeService;
import com.hotel.service.impl.RoomTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/roomtype/list")
public class ListController extends HttpServlet {
    RoomTypeService roomTypeService = new RoomTypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Roomtype> list = roomTypeService.list();
        // 把list 传给前端
        String str = JSONObject.toJSONString(list);
        // 发送到前端
        response.getWriter().write(str);
        /**
         * [
         *  {
         *      id：1,
         *      name: '大床房',
         *      size:2,
         *      note:'大床'
         *  },
         *
         *  {
         *      id:2,
         *      name:'双人间',
         *      size:2,
         *      note:'两张床'
         *  }
         *  ]
         *
         *
         * */
    }
}
