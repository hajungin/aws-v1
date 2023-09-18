package com.example.awsv1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer number ){
        if(number == 1){
            log.info("/aws/v1 호출. Info 로그 #################################");
        } else if (number == -1) {
            log.error("/aws/v1 호출. Warn 로그 #################################");
        } else if (number == 0){
            log.warn("/aws/v1 호출. Error 로그 #################################");
        }
        return "<H1>aws v1</H1>";
    }
}
