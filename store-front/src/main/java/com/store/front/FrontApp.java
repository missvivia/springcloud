package com.store.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by zengpeng on 2018/8/22.
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.store.*")
public class FrontApp {

    public static void main(String[] args) {
        SpringApplication.run(FrontApp.class, args);
    }
}
