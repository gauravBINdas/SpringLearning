package com.practice.spring.services;

import java.util.List;

import com.practice.spring.beans.Employee;

public interface EmployeeService {
	public int addEmployee(Employee employee) throws Exception;

	public List<Employee> findById(int id) throws Exception;
}
