package cn.xrz.springcloud_1.member.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XRZ
 * @date 2019-04-17
 * @Description :
 */
@RestController
public class MemberApiController {

    @RequestMapping("/getMember")
    public String getMember(){
        return "this is Member";
    }

}
