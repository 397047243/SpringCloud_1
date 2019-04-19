package cn.xrz.springcloud_1.order.api.controller;

import cn.xrz.springcloud_1.order.feign.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XRZ
 * @date 2019-04-19
 * @Description :
 */
@RestController
public class OrderApiController {

    @Autowired
    private MemberFeign memberFeign; //member中的接口

    @RequestMapping("/feignMember")
    public String feginMember(){
        return memberFeign.getMember();
    }

    @RequestMapping("/index")
    public String index(){
        return memberFeign.toString();
    }

}
