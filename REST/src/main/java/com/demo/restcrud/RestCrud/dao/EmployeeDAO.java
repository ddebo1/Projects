package com.demo.restcrud.RestCrud.dao;

import java.util.List;

import com.demo.restcrud.RestCrud.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();
	
	Employee findbyId(int id);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int id);
	
	
	
	
	

}
