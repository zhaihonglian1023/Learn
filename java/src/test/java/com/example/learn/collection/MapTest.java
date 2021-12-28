package com.example.learn.collection;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void test1(){
        Map<String,Object> map = new HashMap<String, Object>(10);
        map.put("name","tom");
        map.put("age",20);
        map.put("hobby","singsong");
        map.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
    }
}
