package com.hai.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderProvider8001Application.class, args);
    }
}
