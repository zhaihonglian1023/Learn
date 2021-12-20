package com.example.learn.domain;

public class CharTest {
    public static void main(String[] args) {
//        String fieldName = "special";
//        char[] cs = fieldName.toCharArray();
//        cs[0] -= 32;
//        String methodName = "get" + String.valueOf(cs);
//        System.out.println(methodName);
//        System.out.println(cs[0]);
//        System.out.println(cs);
//
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        String s3 = "hello";
//        System.out.println(s1 == s2);
        CharTest charTest = new CharTest();
        System.out.println(charTest.aFloat1());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(12345);
        System.out.println(stringBuffer.length());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(13455);
        System.out.println(stringBuilder.length());
    }
    public Float aFloat1(){
        Test2 test2 = new Test2();
        return test2.aFloat();
    }
}
class Test2{
    public float aFloat(){
        return 1.2F;
    }
}
