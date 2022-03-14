package com.example.learn.collection;

import org.testng.annotations.Test;

import java.util.*;

/**
 * 1、List集合类中元素有序、且可重复，动态数组
 *      ——ArrayList：作为List接口的主要实现类，线程不安全的，执行效率高；底层使用Object[] elementData存储
 *      ——LinkedList：对于频繁的插入、删除操作，使用此效率比ArrayList高；底层使用双向链表存储，
 *      ——Vector：作为List的古老实现类，线程安全的，执行效率低；底层使用object[] elementData存储
 *
 * 2、ArrayList源码分析：jdk7情况下
 *      ArrayList array = new ArrayList();//底层创建了长度是10的Object[]数组elementData
 *      array.add(123);//elementData[0]=new Integer(123);
 *      ...
 *      array.add(11);如果此次的添加导致底层elementData数组容量不够，则扩容，默认情况下，扩容为原来的容量
 *      的1.5倍，同时需要将原有数组中的数据复制到新的数组中。
 *      结论：建议开发中使用带参的构造器ArrayList list = new ArrayList(int capacity)
 *  ————jdk8中ArrayList的变化
 *      ArrayList list = new ArrayList();、、底层Object[] elementData初始化为{}，并没有创建长度为10的数组
 *      list.add(123);//第一次调用add()时，底层才创建了长度10的数组，并将数据123添加到elementData数组中
 *      后续的添加和扩容操作与jdk7无异
 *  总结：jdk7中的ArrayList的对象的创建类似于单例的饿汉式，而jdk8中的ArrayList的对象的创建类似于单例的懒汉式，
 *  延迟了数组的创建，节省内存空间。
 *
 * 3、LinkedList内部源码分析
 *      LinkedList list = new LinkedList();内部声明了Node类型的first和last属性，默认值为null
 *      list.add(123);//将123封装到Node中，创建Node对象。
 *      其中，Node定义为：体现了LinkedList的双向链表的说法
 *          private static class Node<E> {
 *         E item;
 *         Node<E> next;
 *         Node<E> prev;
 *
 *         Node(Node<E> prev, E element, Node<E> next) {
 *             this.item = element;
 *             this.next = next;
 *             this.prev = prev;
 *         }
 *     }
 * 4、Vector的源码分析：jdk7和jdk8中通过Vector()构造器创建对象时，底层都创建了长度为10的数组，在扩容方面，
 *      默认扩容为原来数组长度的2倍。
 *
 * 相同点：三个类都实现了List接口，存储数据的特点相同：存储有序的，可重复的数据
 * 不同点：如上
 */

public class ListTest {

    @Test
    public void test1(){
        List<Object> list = new ArrayList<Object>(10);
        list.add(123);
        list.add(456);
        list.add(789);
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add(1,"pdd");
        System.out.println(list);
        System.out.println("列表长度:"+list.size());
        System.out.println(list.indexOf("hello"));
        System.out.println(list.lastIndexOf("hello"));
    }
    @Test
    public void test2(){
        List<Object> list = new ArrayList<>();
        list.add(123);
        Collection<Object> co = Arrays.asList(234,"hello");
        list.addAll(co);
        System.out.println(list);
    }
    @Test
    public void test3(){
        List<Object> list = new LinkedList<>();
        list.add(123);
        list.add("hello");
        Object [] object = list.toArray();
        System.out.println(object.length);
        for (Object o : object) {
            System.out.println(o);
        }
        System.out.println(list);
    }
    @Test
    public void test4(){
        String [] str={"bdhsj","hfkdsh","kkk"};
        for (String s:str) {
            int length = s.length();
            for(int i=0;i<length;i++){
                System.out.println(s.charAt(i));
            }
            System.out.println("s:"+s);
        }
    }
}
