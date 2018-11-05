package com.hai.wei.service;

import com.hai.wei.form.CreateOrderForm;
import com.hai.wei.pojo.order.OrderInfo;
import com.hai.wei.pojo.resp.Response;
import com.hai.wei.service.order.OrderService;
import com.hai.wei.util.order.OrderUtils;
import org.springframework.stereotype.Service;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName OrderService
 * @Date 2018/10/27 15:15
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    /**
     * 创建订单
     *
     * @param form
     * @return
     */
    @Override
    public Response<OrderInfo> createOrder(CreateOrderForm form) {
        Response<OrderInfo> response = new Response<>();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(OrderUtils.generateOrderId())
                .setOrderNo(OrderUtils.generateOrderNo())
                .setProductId(form.getProductId())
                .setStatus(1)
                .setCreateTimeMillis(System.currentTimeMillis());
        response.setBody(orderInfo);
        return response;
    }
}
