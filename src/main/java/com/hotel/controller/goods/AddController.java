package com.hotel.controller.goods;

import com.hotel.dao.GoodsDao;
import com.hotel.dao.impl.GoodsDaoImpl;
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
import java.text.DecimalFormat;


@WebServlet("/goods/add")
public class AddController extends HttpServlet {
    GoodsService goodsService = new GoodsServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =req.getParameter("name");
        String goods_type_id = req.getParameter("goodsTypeId");
        String price = req.getParameter("price");
        String unit =req.getParameter("unit");
        String note = req.getParameter("note");
        BigDecimal bd=new BigDecimal(price);
        Goods goods = new Goods(null,name,Integer.valueOf(goods_type_id),bd,unit,note);
        int i = goodsService.addGoods(goods);
        resp.getWriter().write(String.valueOf(i));
    }
}
