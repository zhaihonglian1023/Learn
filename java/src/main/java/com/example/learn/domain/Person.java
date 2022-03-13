package com.example.learn.domain;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    private String name;
    private int age;
    private String action;

    Person(String name,int age,String action){
        this.name=name;
        this.age=age;
        this.action=action;
    }
    Person(){}

    public void run(String name,String action){
        System.out.println(name+action);
    }
}
