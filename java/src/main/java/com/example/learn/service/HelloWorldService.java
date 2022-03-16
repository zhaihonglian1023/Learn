package com.example.learn.service;

import com.example.learn.entity.HelloWorldEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HelloWorldService {

    @Resource
    public HelloWorldEntity helloWorldEntity;

    public HelloWorldEntity message(){
        helloWorldEntity.setName("Little Bai");
        helloWorldEntity.setExpress("Like");
        return helloWorldEntity;
     }
}
