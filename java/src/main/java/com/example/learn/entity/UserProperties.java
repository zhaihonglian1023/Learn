package com.example.learn.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "toc")
public class UserProperties {
    private String name1;
    private String note;
}
