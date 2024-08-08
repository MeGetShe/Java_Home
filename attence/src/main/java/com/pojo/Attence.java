package com.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Attence)实体类
 *
 * @author makejava
 * @since 2024-08-07 14:30:20
 */
public class Attence implements Serializable {
   
    /**
     * ID
     */
    private Integer id;
    /**
     * 员工姓名
     */
    private String empName;
    /**
     * 部门
     */
    private String dept;
    /**
     * 登记日期
     */
    private Date chkDate;
    /**
     * 考勤类型
     */
    private String status;

    @Override
    public String toString() {
        return "Attence{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", chkDate=" + chkDate +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getChkDate() {
        return chkDate;
    }

    public void setChkDate(Date chkDate) {
        this.chkDate = chkDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

