package com.example.learn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Component
public class HelloWorldEntity implements Serializable {
    private String name;
    private String express;

    @Override
    public boolean equals(Object o) {
        System.out.println("开始调用equals方法");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HelloWorldEntity that = (HelloWorldEntity) o;

        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(express, that.express);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (express != null ? express.hashCode() : 0);
        return result;
    }



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

