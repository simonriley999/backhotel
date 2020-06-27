package com.hotel.controller.consume;

import com.hotel.pojo.Consume;
import com.hotel.service.ConsumeService;
import com.hotel.service.impl.ConsumeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@WebServlet("/consume/add")
public class AddController extends HttpServlet {
    ConsumeService consumeService = new ConsumeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String no = req.getParameter("no");
        String roomNumber = req.getParameter("roomNumber");
        String goodsName = req.getParameter("goodsName");
        String number = req.getParameter("number");
        String goodsPrice = req.getParameter("goodsPrice");
        BigDecimal gp =new BigDecimal(goodsPrice);
        String consumeMoney = req.getParameter("consumeMoney");
        BigDecimal cm = new BigDecimal(consumeMoney);
        String discountRate = req.getParameter("discountRate");
        BigDecimal dr = new BigDecimal(discountRate);
        String discountMoney = req.getParameter("discountMoney");
        BigDecimal dm = new BigDecimal(discountMoney);
        String sumMoney = req.getParameter("sumMoney");
        BigDecimal sm=new BigDecimal(sumMoney);
        String userId = req.getParameter("userId");
        LocalDateTime date = LocalDateTime.now();
        String note = req.getParameter("note");
        Consume consume = new Consume(null,no,roomNumber,goodsName,Integer.valueOf(number),gp,cm,dr,dm,sm,Integer.valueOf(userId),date,note);
        int i = consumeService.add(consume);
        resp.getWriter().write(String.valueOf(i));
    }
}
