package com.ust.PFDetails;

public class FinalAmount {
	
	private double PFAmount;
	private double FinalAmount;
	public double getPFAmount() {
		return PFAmount;
	}
	public void setPFAmount(double pFAmount) {
		PFAmount = pFAmount;
	}
	@Override
	public String toString() {
		return "PFAmount=" + PFAmount + ", FinalAmount=" + FinalAmount;
	}
	public double getFinalAmount() {
		return FinalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		FinalAmount = finalAmount;
	}
	
	

}
