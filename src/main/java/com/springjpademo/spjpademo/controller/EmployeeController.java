package com.springjpademo.spjpademo.controller;

import com.springjpademo.spjpademo.model.Employee;
import com.springjpademo.spjpademo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Relations: OneToOne, OneToMany, ManyToOne, ManyToMany

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

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        Optional<Employee> emp=employeeRepo.findById(employee.getId());
        if(emp.isPresent()){
            emp.get().setLastName(employee.getLastName());
            emp.get().setCity(employee.getCity());
            employeeRepo.save(emp.get());
            return "Data updated";
        }
        return "Record not Found";
    }
}
