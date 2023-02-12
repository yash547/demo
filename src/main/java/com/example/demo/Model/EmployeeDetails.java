package com.example.demo.Model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "Employee")
@Data
@Entity
public class EmployeeDetails {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "FIRST_NAME")
    private String fname;

    @Column(name = "MIDDLE_NAME")
    private String mname;

    @Column(name = "LAST_NAMES")
    private String lname;
    
    @Column(name = "ADDRESS")
    private String address;
 
 
    
}

