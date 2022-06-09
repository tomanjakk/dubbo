package com.lemon.gmail.service;

import com.lemon.gmail.pojo.UserAddress;

import java.util.List;

public interface OrderService {
    public List<UserAddress> initOrder(String userid);
}
