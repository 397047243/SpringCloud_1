package cn.xrz.springcloud_1.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XRZ
 * @date 2019-04-19
 * @Description :
 */
@FeignClient(name = "app-xrz-member") //指定服务名
public interface MemberFeign {

    @RequestMapping("/getMember")
    public String getMember();
}
