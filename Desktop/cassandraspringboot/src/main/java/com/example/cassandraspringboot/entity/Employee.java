package com.example.cassandraspringboot.entity;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="employee")
public class Employee {

    @PrimaryKey
    @Column(name="emp_id",length=3,nullable=false,unique=true)
    private Integer empId;
    @NotNull
//    @Size(min = 3,message = "Name should contain more than 3 characters")
    @Column(name="emp_name",nullable=false,unique=true)
    private String empName;
    @Email
    @NotNull
    @Column(name = "emp_email",nullable = false,unique=true)
    private String empEmail;
    @NotNull
    @Column(name = "emp_org")
    private String empOrg;
    @NotNull
//    @Size(min = 10,message = "Please enter a valid Phone number")
    @Column(name="emp_phone")
    private long empPhone;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String empEmail, String empOrg, long empPhone) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empOrg = empOrg;
        this.empPhone = empPhone;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpOrg() {
        return empOrg;
    }

    public void setEmpOrg(String empOrg) {
        this.empOrg = empOrg;
    }

    public long getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(long empPhone) {
        this.empPhone = empPhone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empOrg='" + empOrg + '\'' +
                ", empPhone=" + empPhone +
                '}';
    }
}