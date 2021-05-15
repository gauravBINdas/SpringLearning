package com.practice.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.practice.spring.entity.EmployeeEntity;

public interface EmployeeDao extends CrudRepository<EmployeeEntity, Integer> {

	@Query(name = "EmployeeDao.findById")
	List<EmployeeEntity> findById(int id) throws Exception;

	// @Query(name = "EmployeeDao.findAddressOfEmployee")
	// List<AddressEntity> findAddressOfEmployee(int id) throws Exception;

}
