package com.lrh.consumer;

import com.lrh.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


//对MICROSERVICE-CLOUD-PROVIDER这个微服务使用自定义发负载均衡算法规则，配置和不能和主启动类在同一个包或者子包中
@RibbonClient(name = "MICROSERVICE-CLOUD-PROVIDER",configuration = MySelfRule.class)
@SpringBootApplication
@EnableEurekaClient //启用eureka客户端
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
