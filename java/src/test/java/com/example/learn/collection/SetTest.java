package com.example.learn.collection;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Set接口：存储无序的、不可重复的数据（没有额外定义新的方法，使用的都是Collection中定义的方法）
 *      HashSet：作为Set接口的主要实现类，线程不安全的，可以存储null值
 *          LinkedHashSet：作为HashSet的子类，遍历内部数据时，可以按照添加的顺序遍历
 *      TreeSet：可以按照添加对象的执行属性，进行排序
 * 以HashSet为例说明：
 * 1、无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的
 * 2、不可重复性：保证添加的元素按照equals()判断时，不能返回true，即：相同的元素只能添加一个
 * 3、添加元素的过程：我们向HashSet中添加元素a，首先调用元素a所在类的hashCode()方法，计算元素a的哈希值，此哈希值接着通过某种算法计算
 * 出在HashSet底层数组中的存放位置，即为索引位置，判断数组在此位置上是否已经有元素：
 *      如果此位置上没有其他元素，则元素a添加成功。
 *      如果此位置有其他元素b（或以链表形式存在的多个元素）则比较元素a与元素b的hash值：
 *          如果hash值不相同，则元素a添加成功
 *          如果hash值相同，进而需要调用元素a所在类的equals()方法：
 *              equals()返回true，元素a添加失败
 *              equals()返回false，元素a添加成功
 *      对于添加成功的情况2和情况3而言，元素a与已经存在指定索引位置上数据以链表的方式存储。
 *      jdk7：元素a放在数组中，指向原来的元素
 *      jdk8：原来的元素在数组中，指向元素a
 *      总结：七上八下
 *      HashSet底层：数组+链表
 */

public class SetTest {
    @Test
    public void test1(){
        Set<Object> set = new HashSet<>();
        set.add(123);
        set.add("234");
        set.add("hello");
        System.out.println(set);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
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
