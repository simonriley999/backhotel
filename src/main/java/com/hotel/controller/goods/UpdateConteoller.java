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
import java.math.BigDecimal;


@WebServlet("/goods/update")
public class UpdateConteoller extends HttpServlet {
    GoodsService goodsService = new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Goods goods = new Goods();
        goods = goodsService.findGoods(Integer.valueOf(id));
        resp.getWriter().write(JSONObject.toJSONString(goods));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name =req.getParameter("name");
        String goods_type_id = req.getParameter("goodsTypeId");
        String price = req.getParameter("price");
        String unit =req.getParameter("unit");
        String note = req.getParameter("note");
        BigDecimal bd=new BigDecimal(price);
        Goods goods = new Goods(Integer.valueOf(id),name,Integer.valueOf(goods_type_id),bd,unit,note);
        int i = goodsService.updateGoods(goods);
        resp.getWriter().write(String.valueOf(i));
    }
}
