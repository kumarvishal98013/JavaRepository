package com.springboot.employeeportal.beans;

import java.util.List;

import com.springboot.employeeportal.entity.Employee;

public interface IEmployeeService {
	
	public List<?> getAllEmployee();

	public String createEmployee(Employee employee);

}
