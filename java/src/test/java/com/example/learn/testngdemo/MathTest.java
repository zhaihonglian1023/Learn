package com.example.learn.testngdemo;

import org.testng.annotations.Test;

public class MathTest {

    @Test
    public void test1(){
        System.out.println((int)Math.round(47.5));
        System.out.println((int)Math.floor(47.5));
    }
}
