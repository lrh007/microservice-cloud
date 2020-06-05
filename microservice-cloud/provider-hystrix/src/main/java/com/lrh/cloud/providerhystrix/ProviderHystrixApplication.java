package com.lrh.cloud.providerhystrix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableCircuitBreaker //添加熔断机制支持
@EnableEurekaClient //开启eureka客户端
@MapperScan
@SpringBootApplication
public class ProviderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApplication.class, args);
    }

}
