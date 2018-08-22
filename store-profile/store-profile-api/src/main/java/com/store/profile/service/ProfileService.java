package com.store.profile.service;

import com.store.profile.meta.Profile;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zengpeng on 2018/8/19.
 */
@FeignClient("store-profile")
public interface ProfileService {


    @GetMapping("/profile/findProfileById")
    public Profile findProfileById(@RequestParam(name = "id") String pId);


    @GetMapping("/profile/findProfileByUserName")
    public Profile findProfileByUserName(@RequestParam(name = "userName") String pUserName);

    @GetMapping("/profile/findProfileByPhone")
    public Profile findProfileByPhone(@RequestParam(name = "phone") String pPhone);


}
