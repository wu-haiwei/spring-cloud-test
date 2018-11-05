package com.hai.wei.controller;

import com.hai.wei.form.CreateOrderForm;
import com.hai.wei.pojo.order.OrderInfo;
import com.hai.wei.pojo.resp.Response;
import com.hai.wei.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public Response<OrderInfo> createOrder(@RequestBody CreateOrderForm form) {
        return orderService.createOrder(form);
    }
}
