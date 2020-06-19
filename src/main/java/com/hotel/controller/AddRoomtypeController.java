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

@WebServlet("/roomtype/add")
public class AddRoomtypeController extends HttpServlet {
    IRoomTypeService roomTypeService = new RoomTypeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String size = req.getParameter("size");
        String note = req.getParameter("note");
        RoomType roomType = new RoomType(null, name, Integer.valueOf(size), note);
        int result = roomTypeService.addRoomtype(roomType);
        System.out.println(result);
        resp.getWriter().write(String.valueOf(result));
    }
}
