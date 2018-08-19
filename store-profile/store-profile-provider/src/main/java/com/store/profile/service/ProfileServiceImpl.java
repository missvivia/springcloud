package com.store.profile.service;

import com.store.profile.meta.Profile;

/**
 * Created by zengpeng on 2018/8/19.
 */
public class ProfileServiceImpl implements ProfileService {


    private Profile dummy() {

        Profile p = new Profile();
        p.setId("u1001");
        p.setPhone("q213123123");
        p.setPassword("sdsdsd");
        p.setUserName("uname");

        return p;
    }


    public Profile findProfileById(String pId) {
        return dummy();
    }

    public Profile findProfileByUserName(String pUserName) {
        return dummy();
    }

    public Profile findProfileByPhone(String pPhone) {
        return dummy();
    }
}


