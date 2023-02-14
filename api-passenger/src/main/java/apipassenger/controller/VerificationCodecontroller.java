package apipassenger.controller;

import apipassenger.request.verificationcodedto;
import apipassenger.service.verificationcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Auther: yk
 * @ Date: 2023/2/13 - 02 - 13 - 17:10
 * @ Description: testapi.controller
 * @ version: 1.0
 */
@RestController
public class VerificationCodecontroller {
    @Autowired
    private verificationcode verificationcode;

    @GetMapping("/verification-code")
    public String verificationCode(@RequestBody verificationcodedto verificationcodedto){
        String phonenum = verificationcodedto.getPassengerPhone();
        System.out.println("手机号码为："+phonenum);
        return verificationcode.verificationcode(phonenum);
    }
}
