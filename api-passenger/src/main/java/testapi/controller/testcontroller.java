package testapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Auther: yk
 * @ Date: 2023/2/10 - 02 - 10 - 17:14
 * @ Description: testapi.controller
 * @ version: 1.0
 */
@RestController
public class testcontroller {
    @GetMapping("/test")
    public String test(){
        return "test api-passenger";
    }
}
