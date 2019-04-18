package cn.xrz.springcloud_1.zookeeper_member2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient //用于向第三方注册中心上注册服务
public class ZookeeperMemberApplication2 {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){
        return "this is Zookeeper:"+port;
    }

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperMemberApplication2.class, args);
    }


}
