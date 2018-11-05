package com.hai.wei.service.order;

import com.hai.wei.falback.FeignOrderServiceFallbackFactory;
import com.hai.wei.form.CreateOrderForm;
import com.hai.wei.pojo.order.OrderInfo;
import com.hai.wei.pojo.resp.Response;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName FeignOrderService
 * @Date 2018/11/4 14:45
 * @Version 1.0
 */
@FeignClient(value = "SERVICE-ZUUL-GETWAY", fallbackFactory = FeignOrderServiceFallbackFactory.class)
public interface FeignOrderService {

    @PostMapping(value = "/haiwei/orderp/order/createOrder")
    Response<OrderInfo> createOrder(@RequestBody CreateOrderForm form);
}
