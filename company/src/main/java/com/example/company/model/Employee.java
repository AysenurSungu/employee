package com.example.company.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String job_title;
    private String phone;
    @Column(nullable = false, updatable = false)
    private String employee_code;


}
