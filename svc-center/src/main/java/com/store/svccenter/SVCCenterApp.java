package com.store.svccenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zengpeng on 2018/8/22.
 */
@EnableEurekaServer
@SpringBootApplication
public class SVCCenterApp {

    public static void main(String[] args) {
        SpringApplication.run(SVCCenterApp.class, args);
    }
}
