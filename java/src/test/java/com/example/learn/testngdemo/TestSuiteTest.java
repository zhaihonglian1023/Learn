package com.example.learn.testngdemo;

import org.testng.annotations.*;

public class TestSuiteTest {

//    @BeforeSuite
//    public void beforeSuite(){
//        System.out.println("beforeSuite");
//    }
//
//    @AfterSuite
//    public void afterSuite(){
//        System.out.println("afterSuite");
//    }
//
//    @BeforeTest
//    public void beforeTest(){
//        System.out.println("beforeTest");
//    }
//
//    @AfterTest
//    public void afterTest(){
//        System.out.println("afterTest");
//    }

    @Test(groups = "group1")
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("beforeMethod");
//    }
//
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("afterMethod");
//    }
//
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("beforeClass");
//    }
//
//    @AfterClass
//    public void afterClass(){
//        System.out.println("afterClass");
//    }

    @BeforeGroups(groups = "group1")
    public void beforeGroups(){
        System.out.println("beforeGroups--------");
    }

    @AfterGroups(groups = "group1")
    public void afterGroups(){
        System.out.println("afterGroups---------");
    }
}
