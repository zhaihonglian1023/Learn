package com.example.learn.entity;


public class Animal {
//    public Animal(){};
    String name;
    public Animal(String name){
        this.name=name;
    }

    public Animal() {
        System.out.println("fulei");
    }
}

class Dog extends Animal{
    String name;
    Integer age;
    private Dog(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("tom",3);
        System.out.println("hh");
    }
}

