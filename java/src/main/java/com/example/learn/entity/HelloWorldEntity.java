package com.example.learn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
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

