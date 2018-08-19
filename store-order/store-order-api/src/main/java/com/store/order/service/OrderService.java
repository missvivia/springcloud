package com.store.order.service;

import com.store.order.meta.Order;

/**
 * Created by zengpeng on 2018/8/19.
 */
public interface OrderService {


    public Order findOrderById(String pId);
}
