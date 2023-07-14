package com.example.sendmail_schedule.controller;

import com.example.sendmail_schedule.service.Impl.ExpiredServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class test {

    @Autowired
    private ExpiredServiceImpl expiredService;

    @Scheduled(cron = "1 * * * * *")
    @GetMapping("/test")
    public ResponseEntity<String> test(){
        System.out.println(1);
        return new ResponseEntity<>(expiredService.processExpried(), HttpStatus.OK);
    }
}
