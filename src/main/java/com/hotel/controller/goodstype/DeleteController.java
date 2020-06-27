package com.hotel.controller.goodstype;

import com.hotel.service.GoodsTypeService;
import com.hotel.service.impl.GoodsTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/goodstype/delete")
public class DeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        GoodsTypeService goodsTypeService = new GoodsTypeServiceImpl();
        int a = goodsTypeService.delete(Integer.valueOf(id));
        resp.getWriter().write(a);
    }
}
