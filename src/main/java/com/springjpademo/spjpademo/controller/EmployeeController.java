package com.springjpademo.spjpademo.controller;

import com.springjpademo.spjpademo.model.Employee;
import com.springjpademo.spjpademo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmp")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Employee saved";
    }

    @GetMapping("/getallemployees")
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    @GetMapping("/getEmp/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){
        return employeeRepo.findById(id);
    }
}
