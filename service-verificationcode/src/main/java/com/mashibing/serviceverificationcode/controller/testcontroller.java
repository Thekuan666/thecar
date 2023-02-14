package com.mashibing.serviceverificationcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Auther: yk
 * @ Date: 2023/2/14 - 02 - 14 - 17:01
 * @ Description: com.mashibing.serviceverificationcode.controller
 * @ version: 1.0
 */
@RestController
public class testcontroller {

    @GetMapping("/test")
    public String testcon(){
        return "verificationcode";
    }
}
