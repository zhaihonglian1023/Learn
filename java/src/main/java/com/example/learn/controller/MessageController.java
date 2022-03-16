package com.example.learn.controller;

import com.example.learn.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MessageController {

    @Resource
    private MessageService messageService;

    @RequestMapping("/getMessage")
    @ResponseBody
    public Object getMessageService(){
        return messageService.getMessage("Tom");
    }
}
