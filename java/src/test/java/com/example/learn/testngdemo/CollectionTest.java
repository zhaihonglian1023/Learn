package com.example.learn.testngdemo;

import com.example.learn.entity.Student;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

import com.example.learn.entity.HelloWorldEntity;

public class CollectionTest {

    @Test
    public void test1(){
        Collection<Object> collection = new ArrayList<Object>();
        collection.add(123);
        collection.add(456);
        System.out.println(collection);

        Collection<Object> collection1 = Arrays.asList(123,456,567);
        System.out.println(collection1);

        System.out.println(collection.containsAll(collection1));
        for (Object ob : collection.toArray()) {
            System.out.println(ob);
        }
    }

    @Test
    public void test2(){
        int a = 13000;
        if(a>=10000){
            System.out.println("hello");
        }else {
            System.out.println("hi");
        }
    }

    @Test
    public void test3(){
        HelloWorldEntity helloWorldEntity = new HelloWorldEntity();
        System.out.println(helloWorldEntity);
    }

    @Test
    public void test4(){
        String string1 = "10.23.0";
        String string2 = "10.23.5";
        System.out.println(string1.compareTo(string2));
    }

    @Test
    public void test5(){
        String s1 = "https://wxcvip.58.com/api/index?wxcvip_jump=%7B%22wxcvip_spm%22%3A%221.858-863-865.1%22%2C%22id%22%3A1638847653491%7D&name=%E9%AB%98%E9%80%9A%E8%BF%87%E7%8E%87%E4%BB%BB%E5%8A%A1&type=highpass&launchApp=false#/list";
        String s2 = s1.replace("https://wxcvip.58.com/","/");
        System.out.println(s2);

        String s3 = "ssbss";
        String s4 = s3.replace("ss","a");
        System.out.println(s4);
    }

    @Test
    public void test6(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("a",3));
        list.add(new Student("b",5));
        list.add(new Student("c",12));
        list.add(new Student("d",7));
        list.stream().filter(a->a.getAge()>5 || a.getAge()<7).filter(a->a.getAge()>7).forEach(b -> System.out.println(b.toString()));
        String name = list.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Student::getName)
                .findAny()
                .orElse(null);
        System.out.println("name:"+name);
        Student name1 = list.stream().filter(x-> "hh".equals(x.getName())).findAny().orElse(null);
        System.out.println("name1:"+name1);
        List<Integer> name2 = list.stream().map(Student::getAge).collect(Collectors.toList());
        System.out.println("name2:"+name2);

    }

    @Test
    public void test7(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        list.stream().filter(l->l>2).forEach(System.out::println);
    }

    @Test
    public void test8(){
        Collection<Object> collection = new ArrayList<>();
        collection.add(3);
        collection.add("hh");

        Iterator<Object> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test9(){
        List<String> list = Arrays.asList("a","b","c");
        List<String> list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list1);
    }

    @Test
    public void test10(){
        List<Integer> list = Arrays.asList(1,5,2,8);
        List<Integer> list1 = list.stream().sorted((x,y)->y-x).collect(Collectors.toList());
        List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println(list);
    }

}
