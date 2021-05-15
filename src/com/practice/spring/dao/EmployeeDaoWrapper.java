package com.practice.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.spring.beans.Address;
import com.practice.spring.beans.Employee;
import com.practice.spring.entity.AddressEntity;
import com.practice.spring.entity.EmployeeEntity;

@Repository
public class EmployeeDaoWrapper {

	@Autowired
	private EmployeeDao employeeDao;

	public int addEmployee(Employee employee) throws Exception {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		AddressEntity addressEntity = new AddressEntity();
		BeanUtils.copyProperties(employee.getAddress(), addressEntity);
		employeeEntity.setAddress(addressEntity);
		employeeEntity.setName(employee.getName());
		EmployeeEntity emp = null;
		emp = employeeDao.save(employeeEntity);
		System.out.println(emp);
		return emp.getId();
	}

	public List<Employee> findById(int id) throws Exception {
		List<EmployeeEntity> listEmp;
		listEmp = employeeDao.findById(id);
		List<Employee> listEmpBean = new ArrayList<>();
		for (EmployeeEntity e : listEmp) {
			Employee empBean = new Employee();
			Address addBean = new Address();
			BeanUtils.copyProperties(e.getAddress(), addBean);
			empBean.setAddress(addBean);
			empBean.setName(e.getName());
			listEmpBean.add(empBean);
		}
		return listEmpBean;
	}
}
