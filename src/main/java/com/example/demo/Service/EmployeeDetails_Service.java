package com.example.demo.Service;

import com.example.demo.Model.EmployeeDetails;

public interface EmployeeDetails_Service {
    
    Object StoreEmployee(EmployeeDetails employee);

    Object fetchdata();

    Object update(EmployeeDetails eDetails);// PUT API

    Object updateaddress(EmployeeDetails eDetail);

}
