package com.hai.wei.controller;

import com.hai.wei.constant.enums.OrderServiceSuffixEnum;
import com.hai.wei.constant.enums.ServiceNamePrefixEnum;
import com.hai.wei.form.CreateOrderForm;
import com.hai.wei.pojo.order.OrderInfo;
import com.hai.wei.pojo.resp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/generateOrder")
    public Response<OrderInfo> generateOrder(Long productId) {
        String serviceURL = ServiceNamePrefixEnum.ORDER_SERVICE_PREFIX.serviceName(OrderServiceSuffixEnum.GENERATE_ORDER_SUFFIX.serviceSuffix());
        CreateOrderForm form = new CreateOrderForm()
                .setProductId(productId)
                .setName("吴海伟")
                .setMobile("18358579595")
                .setAddress("浙江省杭州市余杭区");
        ResponseEntity<Response<OrderInfo>> exchange = restTemplate.exchange(serviceURL, HttpMethod.POST, new HttpEntity<>(form), new ParameterizedTypeReference<Response<OrderInfo>>() {
        });
        return exchange.getBody();
    }
}

