package com.example.learn.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
//@ConfigurationProperties(prefix = "toc")
//@PropertySource(value = "classpath:application.properties")
//@ConfigurationProperties("user")
public class UserFirst {
    @Value("${toc.name1}")
    private String name1;
    @Value("${toc.note}")
    private String note;
}
