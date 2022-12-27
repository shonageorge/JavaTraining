package com.ust.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Anu",20000));
		empList.add(new Employee(2,"Anu",35000));
		empList.add(new Employee(3,"Anu",20000));
		empList.add(new Employee(4,"Anu",40000));
		
		Map<Double,Employee> map= new HashMap<>();
		
		for(Employee e : empList) {
			
			if(map.containsKey(e.getSalary())) {
				Employee emp= map.get(e.getSalary());
				map.put(e.getSalary(),new Employee(e.getId(),e.getName(),e.getSalary()+emp.getSalary()));
			}else {
				map.put(e.getSalary(),new Employee(e.getId(),e.getName(),e.getSalary()));
			}
		}
		System.out.println(map);
		
		
		//empList.stream().collect(Collectors.groupingBy(m->m.getSalary(),Collectors.counting()).entrySet().stream().map(m->m.getValue()*m.getKey()));
		
		//Map<Object, List<Employee>> map =empList.stream().collect(Collectors.groupingBy(m->m.getSalary()));
		
		//System.out.println(map);
		
		//empList.stream().reduce((m,n)->m.getSalary()==n.getSalary()?m:n).ifPresent(null);
		//empList.stream().collect(Collectors.toMap(m->m.getId(), m->m.getSalary())).entrySet().stream().map(null);
		
		//empList.stream().map((m,n)->{
		
		//	return m;
	//	});
	/*public void validate(List<Employee> emp) {
		IntStream.range(0, emp.size()).map(i->emp()
	}*/
	}
}
