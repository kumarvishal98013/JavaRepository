package com.springboot.employeeportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.employeeportal.beans.IEmployeeDao;
import com.springboot.employeeportal.beans.IEmployeeService;
import com.springboot.employeeportal.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	IEmployeeDao iEmployeeDao;

	@Override
	public List<?> getAllEmployee() {
		return iEmployeeDao.findAll();
	}

	@Override
	public String createEmployee(Employee employee) {		
		iEmployeeDao.save(employee);
		return "Success!!";
	}

}
