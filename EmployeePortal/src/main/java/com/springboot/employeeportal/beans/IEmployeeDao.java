package com.springboot.employeeportal.beans;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employeeportal.entity.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Long> {

}
