package com.example.springbootstudy.pojo;

import org.springframework.stereotype.Component;

@Component("landlord")
public class LogicalService {
    public void service() {
        System.out.println("这里输出逻辑层提供的实际业务功能");
    }
}
