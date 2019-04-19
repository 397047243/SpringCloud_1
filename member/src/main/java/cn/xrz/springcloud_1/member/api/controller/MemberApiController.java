package cn.xrz.springcloud_1.member.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XRZ
 * @date 2019-04-17
 * @Description :
 */
@RestController
public class MemberApiController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getMember")
    public String getMember(){
        return "this is Member! port:"+port;
    }

}
