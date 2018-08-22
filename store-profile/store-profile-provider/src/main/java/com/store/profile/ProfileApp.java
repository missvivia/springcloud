package com.store.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by zengpeng on 2018/8/22.
 */
@SpringBootApplication
@EnableEurekaClient

public class ProfileApp {

    public static void main(String[] args) {
        SpringApplication.run(ProfileApp.class, args);
    }

}
