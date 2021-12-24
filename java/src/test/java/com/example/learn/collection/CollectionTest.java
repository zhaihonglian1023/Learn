package com.example.learn.collection;

import com.example.learn.entity.HelloWorldEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

    @Test
    public void test1(){
        //单个元素添加-add
        Collection<Object> collection = new ArrayList<Object>(10);
        collection.add(123);
        collection.add(456);
        collection.add(new HelloWorldEntity("jerry","hello"));
        collection.add("tom");
        collection.add("hello");
        System.out.println(collection);
    }
    @Test
    public void test2(){
        //添加多个元素-addAll
        Collection<Object> collection = new ArrayList<Object>(10);
        Collection<Object> collection1 = new ArrayList<Object>(10);
        collection1.add(123);
        collection1.add(2345);
        collection.addAll(collection1);
        System.out.println("collection"+collection);
        System.out.println("collection1"+collection1);
    }
    @Test
    public void test3(){
        //返回一个数组包含集合中的所有元素-toArray
        Collection<Object> collection = new ArrayList<Object>(10);
        collection.add(123);
        collection.add(456);
        collection.add(new HelloWorldEntity("jerry","hello"));
        collection.add("tom");
        collection.add("hello");
        System.out.println(Arrays.toString(collection.toArray()));
        for (Object ob:collection.toArray()) {
            System.out.println(ob);
        }
    }
    @Test
    public void test4(){
        //清空集合-clear
        Collection<Object> collection = new ArrayList<Object>(10);
        collection.add(123);
        collection.add(456);
        collection.add(new HelloWorldEntity("jerry","hello"));
        collection.add("tom");
        collection.add("hello");
        collection.clear();
        System.out.println(collection);
    }
    @Test
    public void test5(){
        Collection<Object> collection = new ArrayList<Object>(10);
        collection.add(123);
        collection.add(456);
        collection.add(new HelloWorldEntity("jerry","hello"));
        collection.add("tom");
        collection.add("hello");
        //包含元素-contains
        System.out.println(collection.contains(123));
        Collection<Object> collection1 = new ArrayList<Object>(10);
        collection1.add(123);
        collection1.add(456);
        //包含元素集合-返回true-containsAll
        System.out.println(collection.containsAll(collection1));
        Collection<Object> collection2 = new ArrayList<Object>(10);
        collection2.add(123);
        collection2.add("hhh");
        //包含元素集合-返回false-containsAll
        System.out.println(collection.containsAll(collection2));
    }
    @Test
    public void test6(){
        //集合比较
        Collection<Object> collection = new ArrayList<Object>(10);
        collection.add(123);
        collection.add(456);
        Collection<Object> collection1 = new ArrayList<Object>(10);
        collection1.add(123);
        collection1.add(456);
        System.out.println(collection.equals(collection1));
    }
    @Test
    public void test7(){
        Collection<Object> collection = new ArrayList<Object>(10);
        collection.add(123);
        collection.add(456);
        System.out.println(collection.hashCode());
    }
    @Test
    public void test8(){
        Collection<Object> collection = new ArrayList<Object>(10);
        collection.add(123);
        collection.add(456);
        collection.add("hello");
        collection.add("world");
        collection.add("good");
        Iterator<Object> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
