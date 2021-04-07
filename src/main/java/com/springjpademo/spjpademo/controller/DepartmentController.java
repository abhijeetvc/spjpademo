package com.springjpademo.spjpademo.controller;

import com.springjpademo.spjpademo.model.Department;
import com.springjpademo.spjpademo.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping("/savedept")
    private String saveDept(@RequestBody Department department){
        departmentRepo.save(department);
        return "Department saved";
    }

}
