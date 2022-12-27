package com.ust.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PANNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeePAN> empList = Arrays.asList(
			new EmployeePAN(111,"AAGRH1123A"),
			new EmployeePAN(112,"aAGRH1123A"),
			new EmployeePAN(113,"A4GRH1123A"),
			new EmployeePAN(116,"AAGRH1123"),
			new EmployeePAN(114,"GRGRH1463A")
				);
		System.out.println("***Valid PAN ids***");
		empList.stream().filter(emp -> validatePAN(emp.getPanNumber()))
			.forEach(emp -> {
				System.out.println(emp.getEmpID() + "," + emp.getPanNumber());
		});
		
		System.out.println("\n***Invalid PAN ids***");
		empList.stream().filter(emp -> !validatePAN(emp.getPanNumber()))
			.forEach(emp -> {
				System.out.println(emp.getEmpID() + "," + emp.getPanNumber());
		});
			
		
	}
	
	private static boolean validatePAN(String pan) {
		if(pan.length() != 10) return false;
		long size = IntStream.range(0, pan.length())
				.filter(i -> (i>=0 && i<5 && pan.charAt(i) >='A' && pan.charAt(i) <='Z')
						|| (i>=5 && i<9 && Character.isDigit(pan.charAt(i))) 
						|| (i==9 && pan.charAt(i) >='A' && pan.charAt(i) <='Z' ))
				.map(i -> pan.charAt(i))
				.count();
		return size == 10 ? true:false;
	}

}
