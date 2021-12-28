package com.example.learn.collection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    public void test1(){
        List<Object> list = new ArrayList<Object>(10);
        list.add(123);
        list.add(456);
        list.add(789);
        list.add("hello");
        list.add("world");
        list.add(1,"pdd");
        System.out.println(list);
        System.out.println("列表长度:"+list.size());
        System.out.println(list.stream().getClass());
    }
}
