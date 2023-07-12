package com.example.sendmail_schedule.controller;

import com.example.sendmail_schedule.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("/test")
    public String test(){
        emailSenderService.sendEmail("vuvu7722@gmail.com", "kiet", "kiet");
        return "1";
    }
}
