package com.lrh.cloud.api.service;

import com.lrh.cloud.api.bean.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 使用feign实现 接口+注解的负载均衡方式
 */

@FeignClient(value = "MICROSERVICE-CLOUD-PROVIDER",fallbackFactory = DeptClientServiceFallbackFactory.class)
//@FeignClient(value = "MICROSERVICE-CLOUD-PROVIDER")
public interface DeptClientService {
    /**
     * 查询全部
     * @return
     */
    @RequestMapping("/queryAll")
    public List<Dept> queryAll();

    /**
     * 添加部门
     * @param dept
     * @return
     */
    @RequestMapping("/query/{deptNo}")
    public Dept query(@PathVariable("deptNo") Long deptNo);

    /**
     * 查询指定部门
     * @param deptNo
     * @return
     */
    @RequestMapping("/addDept/{deptName}")
    public String addDept(@PathVariable("deptName") String deptName);
}
