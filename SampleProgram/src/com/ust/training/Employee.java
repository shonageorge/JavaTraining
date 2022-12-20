package com.ust.training;

public class Employee {
	
	private String empName;
	private int empID;
	private String location;
	private double salary;
	public Employee(String empName, int empID, String location, double salary) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.location = location;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", location=" + location + ", salary=" + salary
				+ "]";
	}
	
	

}
