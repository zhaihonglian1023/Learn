package com.example.learn.collection;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    @Test
    public void test1(){
        Set<Object> set = new HashSet<>();
        set.add(123);
        set.add("234");
        set.add("hello");
        System.out.println(set);
        System.out.println("------------------");

    }
    @Test
    public void test2(){
        Set<Integer> set1 = new TreeSet<>();
        set1.add(123);
        set1.add(879);
        set1.add(333);
        System.out.println(set1);
        System.out.println("------------------");
    }
    @Test
    public void test3(){
        Set<Object> set = new LinkedHashSet<>();
        set.add(123);
        set.add("hello");
        set.add("world");
        set.add(345);
        System.out.println(set);
    }
}
