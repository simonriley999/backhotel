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

@WebServlet("/roomtype/update")
public class UpdateRoomtypeController extends HttpServlet {
    IRoomTypeService roomTypeService = new RoomTypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        RoomType roomType = roomTypeService.getByID(Integer.valueOf(id));
        resp.getWriter().write(JSONObject.toJSONString(roomType));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String size = req.getParameter("size");
        String note = req.getParameter("note");
        RoomType roomType = new RoomType(Integer.valueOf(id),name,Integer.valueOf(size),note);
        int i = roomTypeService.updateRoomtype(roomType);
        resp.getWriter().write(String.valueOf(i));
    }
}
