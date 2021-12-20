package com.example.learn.service;

import com.example.learn.entity.HelloWorldEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    public HelloWorldEntity helloWorldEntity;
    public HelloWorldEntity message(){
        helloWorldEntity.setName("Little Bai");
        helloWorldEntity.setExpress("Like");
        return helloWorldEntity;
     }
}
