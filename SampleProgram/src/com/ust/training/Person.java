package com.ust.training;

import java.util.List;

public class Person {
	
	private int age;
	private String name;
	private List<String> phNumber;
	public Person(int age, String name, List<String> phNumber) {
		super();
		this.age = age;
		this.name = name;
		this.phNumber = phNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(List<String> phNumber) {
		this.phNumber = phNumber;
	}

}
