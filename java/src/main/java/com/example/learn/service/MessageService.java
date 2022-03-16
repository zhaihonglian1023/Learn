package com.example.learn.service;


import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public String getMessage(String name){
        return name;
    }
}
