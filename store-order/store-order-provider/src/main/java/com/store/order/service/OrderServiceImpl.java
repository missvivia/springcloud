package com.store.order.service;

import com.store.order.meta.Order;

/**
 * Created by zengpeng on 2018/8/19.
 */
public class OrderServiceImpl implements OrderService {

    private Order dummy() {

        Order order = new Order();
        order.setId("o10001");
        order.setUserId("u10001");
        return order;
    }


    public Order findOrderById(String pId) {
        return dummy();
    }
}
