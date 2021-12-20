package com.example.learn.appconfig;


import com.example.learn.entity.UserFirst;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example.springstudy.entity",excludeFilters = {@ComponentScan.Filter(classes = Service.class)})
@ComponentScan(basePackageClasses = {UserFirst.class})
public class AppConfigFirst {
    public UserFirst initUser(){
        UserFirst user = new UserFirst();
//        user.setId(1l);
//        user.setName("user_name_1");
//        user.setNote("note_1");
        return user;
    }
}
