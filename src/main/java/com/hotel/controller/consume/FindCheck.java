package com.hotel.controller.consume;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.Checkin;
import com.hotel.pojo.Consume;
import com.hotel.service.ConsumeService;
import com.hotel.service.impl.ConsumeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/consume/findcheck")
public class FindCheck extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String roomNumber = req.getParameter("roomNumber");
        ConsumeService consumeService = new ConsumeServiceImpl();
        Checkin checkin =new Checkin();
        checkin = consumeService.findCheckin(roomNumber);
        resp.getWriter().write(JSONObject.toJSONString(checkin));
    }
}
