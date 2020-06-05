package com.lrh.provider03.service;

import com.lrh.cloud.api.bean.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询全部
     * @return
     */
    List<Dept> queryAll();

    /**
     * 添加部门
     * @param dept
     * @return
     */
    int addDept(Dept dept);

    /**
     * 查询指定部门
     * @param deptNo
     * @return
     */
    Dept query(Long deptNo);
}
