package com.ust.employeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ust.employeeRegistration.Model.Employee;
import com.ust.employeeRegistration.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	public Employee createEmployee(Employee emp) {
		
		return repository.save(emp);
	}

	public List<Employee> getEmployees() {
		
		return repository.findAll();
	}

	public Employee getEmployeesById(int id) {
		
		return repository.findById(id).orElse(null);
	}

	public Employee updateEmployees(Employee emp) {
		Employee employee= new Employee();
		Optional<Employee> updateEmployee = repository.findById(emp.getEmpID()); 
		if(updateEmployee.isPresent()) {
			employee.setEmpID(updateEmployee.get().getEmpID());
			employee.setDomain(emp.getDomain());
			employee.setEmpName(emp.getEmpName());
			employee.setEmailID(emp.getEmailID());
			employee.setExperience(emp.getExperience());
			employee.setLocation(emp.getLocation());
		}else {
			return new Employee();
		}
		return repository.save(employee);
	}

	public String deleteEmployees(int id) {
		
		repository.deleteById(id);
		return "Employee Deleted Successfully";
		
	}
	
	

}
