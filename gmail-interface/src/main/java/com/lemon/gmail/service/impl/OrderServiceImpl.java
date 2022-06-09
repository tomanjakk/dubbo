package com.lemon.gmail.service.impl;



import com.lemon.gmail.pojo.UserAddress;
import com.lemon.gmail.service.OrderService;
import com.lemon.gmail.service.UserService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userid) {
        List<UserAddress> addresses=userService.getUserAddressList(userid);
        System.out.println(addresses);
        return addresses;
    }
}
