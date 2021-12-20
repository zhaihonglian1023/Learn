package com.example.learn.domain;

import com.alibaba.fastjson.JSON;
import com.example.learn.entity.HelloWorldEntity;

import java.util.*;
import java.util.stream.Collectors;

import static com.example.learn.domain.StudyEnum.*;

public class StreamStudy {
    static ThreadLocal<String> local = new ThreadLocal<>();
    static void print(String str){
        System.out.println(str+":"+local.get());
        local.remove();
    }
    public static void main(String[] args) {
        //stream学习
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        System.out.println(filtered);
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        // 获取对应的平方数
//        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//        System.out.println(squaresList);
//        List<String> strin = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        // 获取空字符串的数量
//        long count = strin.stream().filter(string -> string.isEmpty()).count();
//        System.out.println(count);
        //JSON序列化和反序列化学习
//        TestCase testCase = new TestCase();
//        String a = testCase.st();
//        System.out.println(a);
//        HelloWorldEntity h = JSON.parseObject(a,HelloWorldEntity.class);
//        System.out.println(h);
//        System.out.println(h.getExpress());
//        System.out.println(h.getName());
//        Map<String,HelloWorldEntity> ma = JSON.parseObject(testCase.list(), new TypeReference<HashMap<String, HelloWorldEntity>>(){});
//        System.out.println(ma.get("big").getName());
        //ThreadLocal学习
        local.set("主线程");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                local.set("localV1");
                print("thread1");
                System.out.println("after remove:"+local.get());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                local.set("localV2");
                print("thread2");
                System.out.println("after remove:"+local.get());
            }
        });
        thread1.start();
        thread2.start();
        Map<StudyEnum,Integer> m = new HashMap<>();
        m.put(FIRST,1);
        m.put(PLAY,2);
        m.put(EXPLOSION,3);
        System.out.println(m);
        System.out.println(FIRST);


    }
}
class TestCase{

    public HelloWorldEntity helloWorldEntity = new HelloWorldEntity();
    public String st(){
        helloWorldEntity.setExpress("smile");
        helloWorldEntity.setName("big");
        return JSON.toJSONString(helloWorldEntity);
    }
    public String list(){
        helloWorldEntity.setExpress("smile");
        helloWorldEntity.setName("big");
        List<HelloWorldEntity> computerGameStatisticsPos = new ArrayList<>();
        computerGameStatisticsPos.add(helloWorldEntity);
        Map<String,HelloWorldEntity> map = computerGameStatisticsPos.stream().collect(
                Collectors.toMap(HelloWorldEntity::getName, v -> v, (k1, k2) -> k1));
        return JSON.toJSONString(map);
    }
}
