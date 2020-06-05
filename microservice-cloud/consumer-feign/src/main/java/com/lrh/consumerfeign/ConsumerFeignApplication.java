package com.lrh.consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@EnableFeignClients(basePackages = {"com.lrh.cloud.api.service"})
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.lrh"}) //这里的包扫描路径要修改，不然找不到其他maven模块的组件
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }

}
