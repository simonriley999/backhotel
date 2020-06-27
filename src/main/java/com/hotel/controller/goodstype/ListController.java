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
import java.util.List;

@WebServlet("/goodstype/list")
public class ListController extends HttpServlet {
    GoodsTypeService goodsTypeService=new GoodsTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<GoodsType> list=goodsTypeService.list();
        String str = JSONObject.toJSONString(list);
        resp.getWriter().write(str);
    }
}
