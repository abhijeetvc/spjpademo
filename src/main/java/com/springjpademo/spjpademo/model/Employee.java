package com.springjpademo.spjpademo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String city;

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department department;
}
