package SortingExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmpSort {

	public static void main(String[] args) {
		
		Employee temp =null;
		List<Employee> empList = new ArrayList<>();
		List<Employee> newList = new ArrayList<>();
		
		
		
		empList.add(new Employee(14,"Anu"));
		empList.add(new Employee(10,"Manu"));
		empList.add(new Employee(19,"Ram"));
		empList.add(new Employee(11,"sam"));
		empList.add(new Employee(16,"varun"));
		
	/*	Map<Integer,String> treemap = new TreeMap<>();
		for (int i=0 ; i<empList.size();i++) {
		treemap.put(empList.get(i).getId(), (empList.get(i).getName()));
		}
		
		System.out.println(treemap);*/
		
		for (int i=0 ; i<empList.size();i++) {
			for(int j=i+1;j<empList.size();j++) {
				if(empList.get(i).getId()>empList.get(j).getId()) {
					newList.add(temp);
					empList.add(i,empList.get(j));
					empList.add(j,newList.get(i));
					//System.out.println("print");
				}
			}
		}
		System.out.println(empList);
		//empList.stream().forEach(System.out::println);
	}

}
