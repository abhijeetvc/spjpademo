package com.springjpademo.spjpademo.controller;

import com.springjpademo.spjpademo.model.Customer;
import com.springjpademo.spjpademo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer added";
    }
}
