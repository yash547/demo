package com.example.demo.Service_Implementation;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDetails_dao;
import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Service.EmployeeDetails_Service;

@Service
public class EmployeeDetails_Service_implementation implements EmployeeDetails_Service {

    @Autowired
private EmployeeDetails_dao eDao;

    @Override
    public Object StoreEmployee(EmployeeDetails employee) {
        
        return this.eDao.save(employee);
    }

    // to fetch all the record
    @Override
    public Object fetchdata() {
        
        return eDao.findAll();
    }



    // to update the employee details
    @Override
    public Object update(EmployeeDetails eDetails) {
      
     Optional<EmployeeDetails> elist=eDao.findById(eDetails.getId());// data search

     if(!elist.isPresent())// if the id was not found
     {
return "Record not found";
     }


     //EmployeeDetails r=new EmployeeDetails();// object create
     EmployeeDetails r= elist.get(); // list data transfer to r variable
     

     r.setFname(eDetails.getFname());
     r.setLname(eDetails.getLname());
     r.setMname(eDetails.getMname());
     r.setAddress(eDetails.getAddress());// address update code


     eDao.save(r);
        return "record found";
    }


    // update perticular address for PATCH API
    @Override
    public Object updateaddress(EmployeeDetails eDetail) {
         
     Optional<EmployeeDetails> elist=eDao.findById(eDetail.getId());// data search

     if(!elist.isPresent())// if the id was not found
     {
return "Record not found";
     }


     EmployeeDetails r= elist.get(); // list data transfer to r variable
     
     r.setAddress(eDetail.getAddress());// address update code


     eDao.save(r);
        return "record updated";
    }
    
}
