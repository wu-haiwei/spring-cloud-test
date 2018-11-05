package com.hai.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 微服务监控
 *
 * @author haiwe
 * @ClassName ServiceHystrixDshboard8080Application
 * @Date 2018/11/4 17:29
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ServiceHystrixDshboard8080Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHystrixDshboard8080Application.class, args);
    }
}
