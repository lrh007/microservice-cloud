package com.lrh.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义ribbon负载均衡算法
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //默认是轮询算法，自定义为随机算法
//        return new RandomRule();
        //使用自定义的算法
        return new RoundRobinRule_Customer();
    }
}
