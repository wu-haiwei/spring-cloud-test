package com.hai.wei.falback;

import com.hai.wei.form.CreateOrderForm;
import com.hai.wei.pojo.order.OrderInfo;
import com.hai.wei.pojo.resp.Response;
import com.hai.wei.service.order.FeignOrderService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName FeignOrderServiceFallbackFactory
 * @Date 2018/11/4 16:49
 * @Version 1.0
 */
@Component
public class FeignOrderServiceFallbackFactory implements FallbackFactory<FeignOrderService> {
    @Override
    public FeignOrderService create(Throwable throwable) {
        return new FeignOrderService() {
            @Override
            public Response<OrderInfo> createOrder(CreateOrderForm form) {
                Response response = new Response();
                response.setResponseCode(500);
                response.setMessage("服务器正忙");
                return response;
            }
        };
    }
}
