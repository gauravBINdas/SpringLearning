package com.practice.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.beans.Employee;
import com.practice.spring.dao.EmployeeDaoWrapper;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDaoWrapper employeeDaoWrapper;

	public int addEmployee(Employee employee) throws Exception {
		return employeeDaoWrapper.addEmployee(employee);
	}

	public List<Employee> findById(int id) throws Exception {
		return employeeDaoWrapper.findById(id);
	}
}
