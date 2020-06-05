package com.lrh.consumer.controller;

import com.lrh.cloud.api.bean.Dept;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    public RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(DeptController_Consumer.class);

    //直接调用
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    //通过微服务调用，使用服务提供者的名称
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-CLOUD-PROVIDER";


    @GetMapping("/consumer/queryAll")
    public List<Dept> queryAll(){
        logger.info("consumer...queryAll");
        List<Dept> list =  restTemplate.getForObject(REST_URL_PREFIX+"/queryAll",List.class);
        return list;
    }

    @GetMapping("/consumer/query/{deptNo}")
    public Dept query(@PathVariable Long deptNo){
        logger.info("consumer...query");
        return restTemplate.getForObject(REST_URL_PREFIX+"/query/"+deptNo,Dept.class);
    }
    @GetMapping("/consumer/addDept/{deptName}")
    public String addDept(@PathVariable String deptName){
        logger.info("consumer...addDept");
        return restTemplate.getForObject(REST_URL_PREFIX+"/addDept/"+deptName,String.class);
    }


}
