package com.ust.training;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierConcept {
	
	
	 public static void main(String[] args)
	    {
	    
		
			ArrayList<String> array= new ArrayList<>();
		 
		 array.add("name1");
		 array.add("name2");
		 array.add("name3");
		 
		 
		
		// long count =array.stream().count();
		// boolean firstElement= array.stream().findFirst().isPresent();
		// System.out.println(count);
		 
		 //array.stream().flatMap(null)
		 Supplier<ArrayList<String>> supplier= ()-> array;
		  System.out.println(supplier.get().stream().count());
		 
	    }

}


