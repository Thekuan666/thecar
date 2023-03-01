package apipassenger.service.impl;

import dto.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import responese.Numbercoderesponse;

/**
 * @ Auther: yk
 * @ Date: 2023/3/1 - 03 - 01 - 15:17
 * @ Description: remote
 * @ version: 1.0
 */
@FeignClient("service-verificationcode")
public interface ServiceVerificationcodeClient {

    @RequestMapping(method = RequestMethod.GET,value = "/numbercode/{size}")
    ResponseResult<Numbercoderesponse> getnumbercode(@PathVariable("size") int size);

}
