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

@WebServlet("/roomtype/update")
public class UpdateController extends HttpServlet {
    RoomTypeService roomTypeService = new RoomTypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        // 调用service 查询单条
        Roomtype roomtype = roomTypeService.getById(Integer.valueOf(id));
        // 转成json 输出
        response.getWriter().write(JSONObject.toJSONString(roomtype));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 接收要修改的数据
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String size = request.getParameter("size");
        String note = request.getParameter("note");
        // 把数据封装到对象中
        Roomtype roomtype = new Roomtype(
                                        Integer.valueOf(id)
                                        ,name
                                        ,Integer.valueOf(size)
                                        ,note);
        // 调用服务层修改
        int i = roomTypeService.update(roomtype);
        // 输出返回值
        response.getWriter().write(String.valueOf(i));
    }
}
