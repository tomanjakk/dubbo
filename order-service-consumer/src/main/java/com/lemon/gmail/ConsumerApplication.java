package com.lemon.gmail;

import com.lemon.gmail.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApplication {
//    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        System.out.println("开始启动");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService=applicationContext.getBean(OrderService.class);
//        OrderService orderService = applicationContext.getBean(OrderService.class);
//        调用方法查询出数据
        orderService.initOrder("1");
        System.out.println("调用完成...");
        System.in.read();
    }
}
