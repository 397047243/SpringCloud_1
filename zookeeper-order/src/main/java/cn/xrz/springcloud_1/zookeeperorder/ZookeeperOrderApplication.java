package cn.xrz.springcloud_1.zookeeperorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableDiscoveryClient //用于向第三方注册中心上注册服务
public class ZookeeperOrderApplication{

    @Autowired
   private RestTemplate restTemplate;

    @RequestMapping("/index")
    public String index(){
        String mebmerUrl = "http://zk-member/index";
        //获取服务端的接口的值，验证均衡负载
        return restTemplate.getForObject(mebmerUrl,String.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperOrderApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
