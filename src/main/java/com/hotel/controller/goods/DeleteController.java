package com.hotel.controller.goods;

import com.hotel.service.GoodsService;
import com.hotel.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/goods/delete")
public class DeleteController extends HttpServlet {
    GoodsService goodsService = new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int i = goodsService.deleteGoods(Integer.valueOf(id));
        resp.getWriter().write(String.valueOf(i));
    }
}
