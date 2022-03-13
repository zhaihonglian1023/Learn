package com.example.learn.algorithm;

public class ArrQueueDemo {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
class ArrQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrQueue(int MaxSize){
        maxSize = MaxSize;
        front=-1;
        rear=-1;
        arr = new int[maxSize];

    }
    public boolean isEmpty(){
        return front==rear;
    }
    public boolean isFull(){
        return rear == maxSize-1;
    }
    public void add(int n){
        if(isFull()){
            System.out.println("isFull");
        }
        rear++;
        arr[rear]=n;
    }
}
