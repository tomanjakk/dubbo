package com.atguigu.gmall.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.lemon.gmail.pojo.UserAddress;
import com.lemon.gmail.service.UserService;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....2");
        UserAddress address1 =new UserAddress(1,"文山学院","1","55","5565","22");
        UserAddress address2 =new UserAddress(2,"文山","1","55","5565","22");
        return Arrays.asList(address1,address2);
    }
}
