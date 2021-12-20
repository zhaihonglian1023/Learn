package com.example.learn.testngdemo;

import com.example.learn.enums.Color;
import org.testng.annotations.Test;

public class EnumTest {

    @Test
    public void test1(){
        System.out.println(Color.RED);
    }

    @Test
    public void test2(){
        Color[] color = Color.values();
        for (Color c:color) {
            System.out.println(c);
            System.out.println("获取排序:"+c.getSort());
        }
    }
}
