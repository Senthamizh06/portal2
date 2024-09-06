package com.portal.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;


@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer dept_code;
    
    String dept_name;
    String dept_desc;
    public Integer getDept_code() {
        return dept_code;
    }
    public void setDept_code(Integer dept_code) {
        this.dept_code = dept_code;
    }
    public String getDept_name() {
        return dept_name;
    }
    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
    public String getDept_desc() {
        return dept_desc;
    }
    public void setDept_desc(String dept_desc) {
        this.dept_desc = dept_desc;
    }
    
}
