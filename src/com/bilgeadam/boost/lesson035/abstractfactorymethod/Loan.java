package com.bilgeadam.boost.lesson035.abstractfactorymethod;

public abstract class Loan {
	
	protected double rate;
	abstract void getInterestRate(double rate);
	public void calculateLoanPayment(double loanAmount, int years) {
		
		double EMI; // eşit bir aylık taksit
		int n;
		
		n = years*12;
		rate = rate/1200;
		EMI = ((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;
	
		System.out.println("Your monthly EMI is " +EMI+" for the amount "
		+loanAmount+" you have borrowed");
	}
	
}
