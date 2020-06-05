package com.lrh.cloud.provider.service.impl;

import com.lrh.cloud.api.bean.Dept;
import com.lrh.cloud.provider.mapper.DeptMapper;
import com.lrh.cloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptServiceImpl")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }

    /**
     * 添加部门
     * @param dept
     * @return
     */
    @Override
    public int addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    /**
     * 查询指定部门
     * @param deptNo
     * @return
     */
    @Override
    public Dept query(Long deptNo) {
        return deptMapper.query(deptNo);
    }

}
