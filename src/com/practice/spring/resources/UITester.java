package com.practice.spring.resources;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.spring.beans.Employee;
import com.practice.spring.services.EmployeeServiceImpl;

public class UITester {

	public static void main(String args[]) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"com/practice/spring/resources/Spring-Config-Servlet.xml");
		EmployeeServiceImpl empSvc = (EmployeeServiceImpl) app.getBean("employeeServiceImpl");
		Employee emp = (Employee) app.getBean("employee");
		List<Employee> listOfEmp;
		try {
			System.out.println("Id: " + empSvc.addEmployee(emp));
			listOfEmp = empSvc.findById(16);

			System.out.println("Result: \n" + listOfEmp);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
