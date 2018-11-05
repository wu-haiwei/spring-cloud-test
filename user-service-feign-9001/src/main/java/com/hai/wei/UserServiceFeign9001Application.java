package com.hai.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务降级, 客户端实现
 *
 * @author haiwe
 * @ClassName UserService9001Application
 * @Date 2018/11/4 14:39
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserServiceFeign9001Application {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceFeign9001Application.class, args);
    }
}
