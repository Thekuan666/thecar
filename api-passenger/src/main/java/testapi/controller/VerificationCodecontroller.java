package testapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Auther: yk
 * @ Date: 2023/2/13 - 02 - 13 - 17:10
 * @ Description: testapi.controller
 * @ version: 1.0
 */
@RestController
public class VerificationCodecontroller {

    @GetMapping("/verification-code")
    public String verificationCode(){

        return "";
    }
}
