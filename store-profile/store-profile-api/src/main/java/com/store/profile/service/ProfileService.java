package com.store.profile.service;

import com.store.profile.meta.Profile;

/**
 * Created by zengpeng on 2018/8/19.
 */
public interface ProfileService {


    public Profile findProfileById(String pId);


    public Profile findProfileByUserName(String pUserName);


    public Profile findProfileByPhone(String pPhone);


}
