package com.springboot.employeeportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employeeportal.beans.IEmployeeService;
import com.springboot.employeeportal.entity.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService iEmployeeService;

	@RequestMapping(value = "/getAllEmployee" , method = RequestMethod.GET)
	public List getAllEmployee() {
		return iEmployeeService.getAllEmployee();
	}

	@RequestMapping(value ="/createEmployee", method = RequestMethod.POST)
	public String createEmployee(@RequestBody Employee employee) {
		return iEmployeeService.createEmployee(employee);
	}
	
	
}
