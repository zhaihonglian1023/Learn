package com.example.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class HelloWorldEntity implements Serializable {
    private String name;
    private String express;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    @Override
    public String toString() {
        return "HelloWorldEntity{" +
                "name='" + name + '\'' +
                ", express='" + express + '\'' +
                '}';
    }
}

