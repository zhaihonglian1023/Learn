package com.example.learn.testngdemo;

import org.testng.annotations.Test;

public class TypeTest {
    @Test
    public void test1(){
        String s = "1234";
        int a = Integer.parseInt(s);
        int b = Integer.valueOf(s).intValue();
        System.out.println(String.valueOf(a));
        System.out.println(Integer.toString(a));
        System.out.println(a+b);
        System.out.println(Float.parseFloat(s));
        System.out.println(Float.valueOf(s).floatValue());
        System.out.println(Long.parseLong(s));
        System.out.println(Long.valueOf(s).longValue());
    }
}
