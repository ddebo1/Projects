package com.demo.restcrud.RestCrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.restcrud.RestCrud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
		return query.getResultList();		
	}

	@Override
	public Employee findbyId(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public Employee save(Employee theEmployee) {	
		Employee employee = entityManager.merge(theEmployee);
		return employee;
	}

	@Override
	public void deleteById(int id) {	
		Employee employee = findbyId(id);
		entityManager.remove(employee);
	}

}
