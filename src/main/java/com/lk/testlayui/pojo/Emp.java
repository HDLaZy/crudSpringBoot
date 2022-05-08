package com.lk.testlayui.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName t_emp
 */
@Data
@TableName("t_emp")
public class Emp implements Serializable {
    /**
     * 员工编号
     */
    @TableId("emp_id")
    private Integer empId;

    /**
     * 员工姓名
     */
    @TableField("emp_name")
    private String empName;

    /**
     * 外键，部门编号
     */
    @TableField("emp_dept")
    private Integer empDept;

    /**
     * 员工工资
     */
    @TableField("emp_salary")
    private BigDecimal empSalary;

    /**
     * 员工工作地区
     */
    @TableField("emp_space")
    private String empSpace;



    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Emp other = (Emp) that;
        return (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getEmpDept() == null ? other.getEmpDept() == null : this.getEmpDept().equals(other.getEmpDept()))
            && (this.getEmpSalary() == null ? other.getEmpSalary() == null : this.getEmpSalary().equals(other.getEmpSalary()))
            && (this.getEmpSpace() == null ? other.getEmpSpace() == null : this.getEmpSpace().equals(other.getEmpSpace()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getEmpDept() == null) ? 0 : getEmpDept().hashCode());
        result = prime * result + ((getEmpSalary() == null) ? 0 : getEmpSalary().hashCode());
        result = prime * result + ((getEmpSpace() == null) ? 0 : getEmpSpace().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empId=").append(empId);
        sb.append(", empName=").append(empName);
        sb.append(", empDept=").append(empDept);
        sb.append(", empSalary=").append(empSalary);
        sb.append(", empSpace=").append(empSpace);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}