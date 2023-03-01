package com.mashibing.serviceverificationcode.controller;

import dto.ResponseResult;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import responese.Numbercoderesponse;

/**
 * @ Auther: yk
 * @ Date: 2023/2/14 - 02 - 14 - 17:25
 * @ Description: com.mashibing.serviceverificationcode.controller
 * @ version: 1.0
 */
@RestController
public class Numbercodecontroller {

    @GetMapping("/numbercode/{size}")
    public ResponseResult numbercode(@PathVariable("size") int size){

        System.out.println("size:"+size);
        //生成五位随机验证码
        int num = (int)(Math.random()*Math.pow(10,(size))+1);
        //接口data需要一个numbercode类型的值
        Numbercoderesponse response = new Numbercoderesponse();
        response.setNumbercode(num);

        return ResponseResult.success(response);


    }


}
