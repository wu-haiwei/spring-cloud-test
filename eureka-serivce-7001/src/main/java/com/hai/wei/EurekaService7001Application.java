package com.hai.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName EurekaService7001Application
 * @Date 2018/10/27 16:34
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001Application.class, args);
    }
}
