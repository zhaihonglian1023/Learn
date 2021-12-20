package com.example.learn.aop;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if(name == null || name.trim().equals("")){
            throw new RuntimeException("parameter is null!!");
        }
        System.out.println("hello" + name);
    }
}
