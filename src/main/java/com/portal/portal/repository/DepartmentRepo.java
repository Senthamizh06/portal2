package com.portal.portal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.portal.model.Department;


public interface DepartmentRepo extends JpaRepository<department,Integer> {

    void save(Department department);
    
}
