package com.example.learn.algorithm;

import org.springframework.web.bind.annotation.RestController;
import org.testng.annotations.Test;

import java.util.List;

public class Algorithm {
    /*
    算法找出数组中两数之和为n的下标
     */
    public int test1(){
        return 1;
    }

    /*
    列表内数据重排：奇数排前面，偶数排后面
     */
    public List<Object> test2(){
        return null;
    }

    /*
    算法找出数组中只存在一次的数
     */
    public Object test3(){
        return null;
    }

    /*
    算法两个有序数组合并为一个有序数组
     */
    public List<Object> test4(){
        return null;
    }

    /*
    给定一个字符串，反转字符串
     */
    public String test5(){
        return null;
    }

    /*
    一个球从100米高度落下，弹起高度为50米，再次落下弹起高度为25米，以此类推，每次弹起只有落下高度的一半，编写代码计算落下N次后经过的总路径是多少？
     */
    public void test6(){
    }

    /*
    链表中有个环，如何查询判断是个环
     */
    public boolean test7(){
        return true;
    }

    /*
    输入一个字符串，求第一个只出现过一次的字符
     */
    public String test8(){
        return null;
    }

    /*
    两个大数相加
     */
    public int test9(){
        return 1;
    }

    /*
    给一个字符串，带有空格，非空格字符反转，空格不反转，输出
    a=" sbg jid ook "
     */
    public String test10(String str){
        return null;
    }

    /*
    a=“ab” b="abfafab"  写一个算法，找出b字符串中有多少个a字符串
    1、先判断b串中是否包含a字符串
    2、如果包含，则重新赋值b字符串，新的b字符串从a字符串出现位置+a的长度开始
    3、用到String方法为contains（包含），indexOf（字符串出现位置）
     */
    public int test11(String a_str,String b_str){
        int sum=0;
        while (b_str.contains(a_str)){
            sum++;
            b_str = b_str.substring(b_str.indexOf(a_str)+a_str.length());
            System.out.println(b_str);
        }
        return sum;
    }

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        System.out.println(algorithm.test11("ab","abfafab"));
    }
}
