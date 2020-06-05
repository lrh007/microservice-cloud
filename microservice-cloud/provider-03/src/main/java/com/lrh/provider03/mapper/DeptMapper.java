package com.lrh.provider03.mapper;

import com.lrh.cloud.api.bean.Dept;

import java.util.List;

public interface DeptMapper {

    /**
     * 查询全部
     * @return
     */
//    @Select("select * from dept")
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
