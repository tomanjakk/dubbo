package com.atguigu.gmall.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import com.lemon.gmail.pojo.UserAddress;
import com.lemon.gmail.service.OrderService;
import com.lemon.gmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
//    @Autowired
    @Reference
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userid) {
        System.out.println("用户的id是+"+userid);
        List<UserAddress> addresses=userService.getUserAddressList(userid);
        for (UserAddress userAddress:addresses){
            System.out.println(userAddress.getUserAddress());
        }
        System.out.println(addresses);
        return addresses;
    }
}
