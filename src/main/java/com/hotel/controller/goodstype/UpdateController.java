package com.hotel.controller.goodstype;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.GoodsType;
import com.hotel.pojo.Roomtype;
import com.hotel.service.GoodsTypeService;
import com.hotel.service.impl.GoodsTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/goodstype/update")
public class UpdateController extends HttpServlet {
    GoodsTypeService goodsTypeService = new GoodsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        GoodsType goodsType = new GoodsType();
        goodsType = goodsTypeService.getById(Integer.valueOf(id));
        resp.getWriter().write(JSONObject.toJSONString(goodsType));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String note = req.getParameter("note");
        GoodsType goodsType = new GoodsType(Integer.valueOf(id),name,note);
        int a = goodsTypeService.update(goodsType);
        resp.getWriter().write(String.valueOf(a));
    }
}
