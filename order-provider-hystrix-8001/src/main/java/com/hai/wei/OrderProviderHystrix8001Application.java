package com.hai.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName OrderProviderHystrix8001Application
 * @Date 2018/11/4 16:27
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
public class OrderProviderHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderProviderHystrix8001Application.class, args);
    }
}
