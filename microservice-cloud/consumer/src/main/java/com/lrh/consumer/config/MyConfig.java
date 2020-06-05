package com.lrh.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {

    @Bean
    @LoadBalanced //启用ribbon客户端服负载均很,默认算法是轮询
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    /*@Bean
    public IRule myRule(){
        //重新使用负载均衡的随机算法，代替默认的轮询算法
        return new RandomRule();
    }*/
}
