package com.lrh.cloud.providerhystrix.controller;

import com.lrh.cloud.api.bean.Dept;
import com.lrh.cloud.providerhystrix.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
    @Resource(name = "deptServiceImpl")
    public DeptService deptService;

    @GetMapping("/queryAll")
    public List<Dept> queryAll(){
        logger.info("provider...queryAll");
        return deptService.queryAll();
    }

    @GetMapping("/query/{deptNo}")
    //一旦调用服务方法失败并抛出了错误信息，会自动调用@HystrixCommand标注的fallbackMethod中指定的方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept query(@PathVariable Long deptNo){
        logger.info("provider...query");
        Dept dept = deptService.query(deptNo);
        if(dept == null){
            throw new RuntimeException("该ID："+deptNo+"没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable Long deptNo){
        return new Dept(deptNo,"该ID: "+deptNo+"没有对应的信息，null--@HystrixCommand","no this database in MySQL");
    }

    @GetMapping("/addDept/{deptName}")
    public String addDept(@PathVariable String deptName){
        logger.info("provider...addDept");
        deptService.addDept(new Dept(deptName));
        return "success";
    }


}
