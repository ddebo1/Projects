package com.demo.restcrud.RestCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.restcrud.RestCrud.dao.EmployeeDAO;
import com.demo.restcrud.RestCrud.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDao;
	

	public EmployeeServiceImpl() {
		super();
	}

	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> findAll() {
		return	employeeDao.findAll();
	}

	@Override
	public Employee findbyId(int id) {
		return employeeDao.findbyId(id);
	}

	@Transactional
	@Override
	public Employee save(Employee theEmployee) {
		return employeeDao.save(theEmployee);
	}

	@Transactional
	@Override
	public void deleteById(int id) {
		employeeDao.deleteById(id);	
	}

	

}
