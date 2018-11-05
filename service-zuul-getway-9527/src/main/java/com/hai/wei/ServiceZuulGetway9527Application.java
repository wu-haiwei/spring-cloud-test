package com.hai.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName ServiceZuulGetway9527Application
 * @Date 2018/11/4 19:51
 * @Version 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulGetway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulGetway9527Application.class, args);
    }
}
