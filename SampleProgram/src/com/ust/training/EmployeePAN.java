package com.ust.training;

public class EmployeePAN {
	
	private int empID;
	private String panNumber;
	public EmployeePAN(int empID, String panNumber) {
		super();
		this.empID = empID;
		this.panNumber = panNumber;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	

}
