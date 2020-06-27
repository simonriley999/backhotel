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


@WebServlet("/goods/fenlei")
public class FenleiController extends HttpServlet {
    GoodsService goodsService = new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String goodsTypeId= req.getParameter("goodsTypeId");
        List<Goods> list = goodsService.fenlei(Integer.valueOf(goodsTypeId));
        String str = JSONObject.toJSONString(list);
        resp.getWriter().write(str);
    }
}
