package com.practice.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.portlet.ModelAndView;

import com.practice.spring.beans.Employee;
import com.practice.spring.services.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	@RequestMapping(value = "/loadForm", method = RequestMethod.GET)
	public ModelAndView loadLoginPage() {
		return new ModelAndView("employeeForm", "employeeBean", new Employee());
	}

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> findById(@PathVariable("id") Integer id) throws Exception {
		List<Employee> listEmp = employeeService.findById(id);
		if (listEmp == null)
			return new ResponseEntity<List<Employee>>(HttpStatus.INTERNAL_SERVER_ERROR);
		else
			return new ResponseEntity<List<Employee>>(listEmp, HttpStatus.OK);
	}
}
