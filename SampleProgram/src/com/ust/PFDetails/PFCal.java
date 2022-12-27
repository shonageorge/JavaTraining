package com.ust.PFDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PFCal {
	
	public static void main(String[] args) {
		
		List<EmplDetails> empList = new ArrayList<>();
		
		empList.add(new EmplDetails("A12D","Anu","Hyd",34000));
		empList.add(new EmplDetails("A13D","Ramu","Che",18000));
		empList.add(new EmplDetails("A14D","Sam","Kochin",55000));
		empList.add(new EmplDetails("A15D","Dane","Tvm",90000));
		empList.add(new EmplDetails("A16D","Ram","Bnglr",95000));
		empList.add(new EmplDetails("A17D","Manu","Bnglr",50000));
	
		FinalAmount fa=new FinalAmount();
	
	for(EmplDetails emp:empList) {
		
		if(emp.getSalary()<25000) {
			fa.setPFAmount(emp.getSalary()*0.05);
			fa.setFinalAmount(emp.getSalary()-fa.getPFAmount());
			
		}else if((emp.getSalary()>25000)&&(emp.getSalary()<50000)) {
			fa.setPFAmount(emp.getSalary()*0.12);
			fa.setFinalAmount(emp.getSalary()-fa.getPFAmount());
			
		}else if((emp.getSalary()>50000)&&(emp.getSalary()<80000)) {
			fa.setPFAmount(emp.getSalary()*0.18);
			fa.setFinalAmount(emp.getSalary()-fa.getPFAmount());
			
		}else if(emp.getSalary()>80000) {
			fa.setPFAmount(emp.getSalary()*0.20);
			fa.setFinalAmount(emp.getSalary()-fa.getPFAmount());
			
		}
		System.out.println(emp +" "+ fa.toString());
	}

	}
}
