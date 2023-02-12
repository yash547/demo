package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Service.EmployeeDetails_Service;

@RestController
public class HomeController 
{
    @Autowired
    private EmployeeDetails_Service employeeDetails_Service;


    @PostMapping("/StoreEmployeeDetails")
    Object StoreEmployee(@RequestBody EmployeeDetails employee)
    {
        

        return this.employeeDetails_Service.StoreEmployee(employee);
    }

@GetMapping("/fetdataofemployee")
    public Object fetchdata() {
    
    return this.employeeDetails_Service.fetchdata();
    }


    @PutMapping("/updateemployee")
    public Object update(@RequestBody EmployeeDetails eDetails) {


        return this.employeeDetails_Service.update(eDetails);
    }



    @PatchMapping("/updtaddress")
    public Object updateaddress(@RequestBody EmployeeDetails eDetail) {

return this.employeeDetails_Service.updateaddress(eDetail);
    }
}

