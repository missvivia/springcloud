package com.store.order.service;

import com.store.order.meta.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zengpeng on 2018/8/19.
 */
@RestController
public class OrderServiceImpl implements OrderService {

    private Order dummy(String id) {

        Order order = new Order();
        order.setId(id);
        order.setUserId("u10001");
        return order;
    }


    @GetMapping("/order/findOrderById")
    public Order findOrderById(@RequestParam(name = "id") String pId) {
        System.out.println("OrderService.findOrderById: " + pId);
        return dummy(pId);
    }
}
