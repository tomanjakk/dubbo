package com.atguigu.gmall.controller;

import com.alibaba.dubbo.config.annotation.Service;
import com.lemon.gmail.pojo.UserAddress;
import com.lemon.gmail.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@Service
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @ResponseBody
    @RequestMapping("/initOder")
    public List<UserAddress> initOder(@RequestParam("uid")String userid){
        return orderService.initOrder(userid);
    }
}
