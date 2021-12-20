package com.example.learn.controller;

import com.alibaba.fastjson.JSON;
import com.example.learn.entity.HelloWorldEntity;
import com.example.learn.entity.UserProperties;
import com.example.learn.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {
    @Autowired
    public HelloWorldService helloWorldService;
    @Autowired
    public HelloWorldEntity ab;
    @Autowired
    public UserProperties userProperties;
    @RequestMapping("/hello")
    public String demo(Model model) {
        ab = helloWorldService.message();
        model.addAttribute("name",ab.getName());
        model.addAttribute("express",ab.getExpress());
        return "/index";
    }
    @RequestMapping("/get")
    @ResponseBody
    public String getProperties(){
        System.out.println(userProperties.getName1());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", userProperties.getName1());
        map.put("note", userProperties.getNote());
        return JSON.toJSONString(map);
    }

}
