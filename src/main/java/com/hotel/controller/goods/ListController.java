package com.hotel.controller.goods;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.Goods;
import com.hotel.service.GoodsService;
import com.hotel.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/goods/list")
public class ListController extends HttpServlet {
    GoodsService goodsService = new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Goods> list = goodsService.listGoods();
        String str = JSONObject.toJSONString(list);
        resp.getWriter().write(str);
    }
}
