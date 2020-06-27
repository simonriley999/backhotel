package com.hotel.controller.goodstype;

import com.hotel.pojo.GoodsType;
import com.hotel.service.GoodsTypeService;
import com.hotel.service.impl.GoodsTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/goodstype/add")
@MultipartConfig


public class AddController extends HttpServlet {
    GoodsTypeService goodsTypeService = new GoodsTypeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //String id=req.getParameter("id");
        String name=req.getParameter("name");
        String note=req.getParameter("note");
        GoodsType goodsType = new GoodsType(null,name,note);
        int i=goodsTypeService.add(goodsType);
        resp.getWriter().write(String.valueOf(i));
    }

}
