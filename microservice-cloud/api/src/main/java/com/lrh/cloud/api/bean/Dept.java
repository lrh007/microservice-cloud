package com.lrh.cloud.api.bean;

import java.io.Serializable;

/**
 * 部门类
 */
public class Dept implements Serializable {
    /**
     * 部门主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据来源，每个微服务可能有一个单独的数据库
     */
    private String dataSource;

    public Dept() {
    }

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    public Dept(Long deptNo, String deptName, String dataSource) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.dataSource = dataSource;
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

}
