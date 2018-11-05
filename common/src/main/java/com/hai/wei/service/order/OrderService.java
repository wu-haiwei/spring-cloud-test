package com.hai.wei.service.order;

import com.hai.wei.form.CreateOrderForm;
import com.hai.wei.pojo.order.OrderInfo;
import com.hai.wei.pojo.resp.Response;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName OrderService
 * @Date 2018/10/27 15:04
 * @Version 1.0
 */
public interface OrderService {

    /**
     * 创建订单
     * @param form
     * @return
     */
    Response<OrderInfo> createOrder(CreateOrderForm form);
}
