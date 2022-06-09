package com.lemon.gmail.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.lemon.gmail.pojo.UserAddress;
import com.lemon.gmail.service.UserService;

import java.util.List;

public class userServiceStub implements UserService {
    private final UserService userService;

//    传入远程代理对象
    public userServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("本地存根被调用了");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
