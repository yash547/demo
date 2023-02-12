package com.example.demo.Dao;
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.example.demo.Model.EmployeeDetails;

public interface EmployeeDetails_dao  extends CrudRepository<EmployeeDetails,Integer>{
 

}
