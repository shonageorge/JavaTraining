package com.ust.employeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.employeeRegistration.Model.Employee;
import com.ust.employeeRegistration.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping(value ="/register",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public Employee addEmployee(Employee emp) {
		return service.createEmployee(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return service.getEmployees();
	}
	
	@GetMapping("/ust/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id){
		return service.getEmployeesById(id);
	}
	
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployees(emp);
	}
	
	@DeleteMapping("/update/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return service.deleteEmployees(id);
	}
}
