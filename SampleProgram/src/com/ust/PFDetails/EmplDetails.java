package com.ust.PFDetails;

/**
 * @author ustjavafsdb419
 *
 */
public class EmplDetails {
	
	private String id;
	private String name;
	private String location;
	private int salary;
	public EmplDetails(String id, String name, String location, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary ;
	}
	
	

}
