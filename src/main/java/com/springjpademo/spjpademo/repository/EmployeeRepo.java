package com.springjpademo.spjpademo.repository;

import com.springjpademo.spjpademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
