package com.store.order.service;

import com.store.order.meta.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zengpeng on 2018/8/19.
 */
@FeignClient("store-order")
public interface OrderService {


    @GetMapping("/order/findOrderById")
    public Order findOrderById(@RequestParam(name = "id") String pId);
}
