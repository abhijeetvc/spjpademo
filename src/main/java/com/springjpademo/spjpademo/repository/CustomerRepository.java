package com.springjpademo.spjpademo.repository;

import com.springjpademo.spjpademo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
