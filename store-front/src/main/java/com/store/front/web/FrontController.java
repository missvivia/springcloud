package com.store.front.web;

import com.store.order.meta.Order;
import com.store.order.service.OrderService;
import com.store.profile.meta.Profile;
import com.store.profile.service.ProfileService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zengpeng on 2018/8/22.
 */
@RestController
@Data
public class FrontController {

    @Autowired
    private ProfileService profileService;

    @Autowired
    private OrderService orderService;


    @GetMapping("/profile")
    public Object profile(@RequestParam("id") String id) {
        Profile p = profileService.findProfileById(id);
        return ResponseEntity.ok(p);
    }

    @GetMapping("/order")
    public Object order(@RequestParam("id") String id) {
        Order order = orderService.findOrderById(id);
        return ResponseEntity.ok(order);
    }


}
