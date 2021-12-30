package com.example.learn.collection;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    @Test
    public void test1(){
        Map<String,Object> map = new HashMap<String,Object>(10);
        map.put("name","tom");
        map.put("age",20);
        map.put("hobby","singsong");
        map.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
        System.out.println("size:"+map.size());
        System.out.println("-----------------------------");
        Iterator<Object> iterator = map.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Map<String,Object> map = new HashMap<>();
        System.out.println(map);
    }
}