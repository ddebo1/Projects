package com.demo.restcrud.RestCrud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.restcrud.RestCrud.entity.Employee;


public interface EmployeeService {
	
	List<Employee> findAll();
	
	Employee findbyId(int id);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int id);
	

}
