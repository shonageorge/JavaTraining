package com.ust.training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee("sam",3,"Hyd",2000),
				new Employee("ram",4,"tvm",3200),
				new Employee("annie",6,"che",1500),
				new Employee("ravi",2,"tvm",4500));
		
		empList.stream().filter(m->m.getLocation().equals("tvm")).forEach(m->System.out.println(m.getEmpName()+":"+m.getLocation()));
		
		Map<Object, List<Employee>> s= empList.stream().collect(Collectors.groupingBy(m->m.getLocation()));
		System.out.println(s);
	}
}
