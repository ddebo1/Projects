package com.demo.restcrud.RestCrud.restcont;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restcrud.RestCrud.Service.EmployeeService;
import com.demo.restcrud.RestCrud.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;

	
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee findById(@PathVariable int employeeId){
		Employee theEmployee =  employeeService.findbyId(employeeId);
		if(theEmployee == null) {
			throw new RuntimeException("Employee Id " + employeeId + " not found");
		}
		return theEmployee;
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		theEmployee.setId(0);
		Employee dbEmployee = employeeService.save(theEmployee);
		return dbEmployee;
	}
	
	@PutMapping("/employees")
	public Employee UpdateEmployee(@RequestBody Employee theEmployee) {
		Employee dbEmployee = employeeService.save(theEmployee);
		return dbEmployee;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteById(@PathVariable int employeeId) {
		
		Employee emp = employeeService.findbyId(employeeId);
		if(emp == null) {
			throw new RuntimeException("Employee Id " + employeeId + " not found");
		}		
		employeeService.deleteById(employeeId);
		
		return "Deleted Employee id : " + employeeId;
	}
		
	
	

}
