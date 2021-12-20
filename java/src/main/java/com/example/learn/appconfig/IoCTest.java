package com.example.learn.appconfig;

import com.example.learn.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = (User) applicationContext.getBean("user");
        User user = (User) applicationContext.getBean("initUser");
        System.out.println(user.getName());
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigFirst.class);
//        UserFirst userFirst = (UserFirst) applicationContext.getBean("userFirst");
//        System.out.println(userFirst.getName1());
//        System.out.println(userFirst.getNote());
    }
}
