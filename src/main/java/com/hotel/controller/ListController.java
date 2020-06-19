package com.hotel.controller;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.RoomType;
import com.hotel.service.IRoomTypeService;
import com.hotel.service.impl.RoomTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/roomtype/list")
public class ListController extends HttpServlet {
    IRoomTypeService roomTypeService = new RoomTypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            List<RoomType> list = roomTypeService.queryRoomType();
            //转成JSON，发送到前端
            String jsonString = JSONObject.toJSONString(list);
            resp.getWriter().write(jsonString);
    }
}
