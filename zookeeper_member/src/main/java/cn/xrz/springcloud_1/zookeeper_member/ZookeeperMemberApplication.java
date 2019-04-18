package cn.xrz.springcloud_1.zookeeper_member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient //用于向第三方注册中心上注册服务
public class ZookeeperMemberApplication {

    @RequestMapping("/index")
    public String index(){
        return "this is Zookeeper";
    }

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperMemberApplication.class, args);
    }

}
