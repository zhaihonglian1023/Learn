package com.example.learn.appconfig;

import com.example.learn.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//    @Bean(value = "user")
    @Bean
    public User initUser(){
        User user = new User();
        user.setId(12323434L);
        user.setName("user_name_1");
        user.setNote("note_1");
        return user;
    }
}
