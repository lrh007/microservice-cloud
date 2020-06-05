package com.lrh.cloud.api.service;

import com.lrh.cloud.api.bean.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Hystrix 服务降级处理类
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Dept query(Long deptNo) {
                return new Dept(deptNo,"该ID："+deptNo+"没有对应的信息,consumer客户端提供降级信息，此刻服务provider已经关闭","no this database in  MySQL");
            }

            @Override
            public String addDept(String deptName) {
                return null;
            }
        };

    }
}
