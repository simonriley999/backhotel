package com.hotel.controller.roomtype;

import com.hotel.pojo.Roomtype;
import com.hotel.service.RoomTypeService;
import com.hotel.service.impl.RoomTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/roomtype/add")
@MultipartConfig
public class AddController extends HttpServlet {
    RoomTypeService roomTypeService = new RoomTypeServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 把数据接收
        String name = request.getParameter("name");
        String size = request.getParameter("size");
        String note = request.getParameter("note");
        // 封装到RoomType对象中
        Roomtype roomtype = new Roomtype(null,name,Integer.valueOf(size),note);
        System.out.println(roomtype);
        // 调用服务层 添加
        int i = roomTypeService.add(roomtype);
        // 输出返回值
        response.getWriter().write(String.valueOf(i));
    }
}
