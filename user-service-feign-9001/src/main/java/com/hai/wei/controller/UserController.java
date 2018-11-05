package com.hai.wei.controller;

import com.hai.wei.form.CreateOrderForm;
import com.hai.wei.pojo.order.OrderInfo;
import com.hai.wei.pojo.resp.Response;
import com.hai.wei.service.order.FeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName UserController
 * @Date 2018/11/4 14:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private FeignOrderService feignOrderService;

    @GetMapping("/generateOrder")
    public Response<OrderInfo> generateOrder(Long productId) {
        CreateOrderForm form = new CreateOrderForm()
                .setProductId(productId)
                .setName("吴海伟")
                .setMobile("18358579595")
                .setAddress("浙江省杭州市余杭区");
        return feignOrderService.createOrder(form);
    }
}
