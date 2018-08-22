package com.store.profile.service;

import com.store.profile.meta.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zengpeng on 2018/8/19.
 */
@RestController
public class ProfileServiceImpl implements ProfileService {


    private Profile dummy(String id) {

        Profile p = new Profile();
        p.setId(id);
        p.setPhone("q213123123");
        p.setPassword("sdsdsd");
        p.setUserName("uname");

        return p;
    }


    @GetMapping("/profile/findProfileById")
    public Profile findProfileById(@RequestParam(name = "id") String pId) {
        System.out.println("ProfileService.findProfileById: " + pId);
        return dummy(pId);
    }

    @GetMapping("/profile/findProfileByUserName")
    public Profile findProfileByUserName(@RequestParam(name = "userName") String pUserName) {
        return dummy(null);
    }

    @GetMapping("/profile/findProfileByPhone")
    public Profile findProfileByPhone(@RequestParam(name = "phone") String pPhone) {
        return dummy(null);
    }
}


