package com.portal.portal.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.portal.model.Department;
import com.portal.portal.repository.DepartmentRepo;
import com.portal.portal.repository.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping(value="/dept")
public class DepartmentController {
    @Autowired
    DepartmentRepo deptRepo;
    
   @PostMapping("/add")
   Department addDepartment(@RequestBody Department department){
    deptRepo.save(department);
    return department;
   }
   @GetMapping("/getAll")
   List<department> getDepartment(){
     List<department> department = deptRepo.findAll();
    return department;
   }
   
   
   }
   


