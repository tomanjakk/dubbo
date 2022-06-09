package com.lemon.gmail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MailApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
