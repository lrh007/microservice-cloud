package com.lrh.provider03.controller;

import com.lrh.cloud.api.bean.Dept;
import com.lrh.provider03.service.DeptService;
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
    public Dept query(@PathVariable Long deptNo){
        logger.info("provider...query");
        return deptService.query(deptNo);
    }
    @GetMapping("/addDept/{deptName}")
    public String addDept(@PathVariable String deptName){
        logger.info("provider...addDept");
        deptService.addDept(new Dept(deptName));
        return "success";
    }


}
