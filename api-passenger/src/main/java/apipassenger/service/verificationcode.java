package apipassenger.service;

import apipassenger.service.impl.ServiceVerificationcodeClient;
import dto.ResponseResult;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import responese.Numbercoderesponse;


/**
 * @ Auther: yk
 * @ Date: 2023/2/13 - 02 - 13 - 17:21
 * @ Description: apipassenger.service
 * @ version: 1.0
 * 返回类型为json 所以需要导入json依赖
 *
 */
@Service
public class verificationcode {

    @Autowired
    private ServiceVerificationcodeClient serviceVerificationcodeClient;
    public String verificationcode(String passengerphone){
        //调用验证码服务获取验证码
        System.out.println("调用验证码，获取验证码");
        ResponseResult<Numbercoderesponse> numcode = serviceVerificationcodeClient.getnumbercode(6);
        int num = numcode.getData().getNumbercode();
        System.out.println("验证码："+num);



        //存入redis
        System.out.println("存入redis");

        //返回值
        JSONObject result = new JSONObject();
        result.put("code",1);
        result.put("message","success");
        return result.toString();

    }


}
