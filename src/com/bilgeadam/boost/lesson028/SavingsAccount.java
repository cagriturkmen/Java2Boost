package com.bilgeadam.boost.lesson028;

public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(String accountNumber, String accountName, double interestRate) {
		super(accountNumber, accountName);
		this.interestRate = interestRate;
	}
	
	
	public void addInterest() {
		
		double interest = getBalance()*interestRate/100;
		deposit(interest);
		
	}


	@Override
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance +amount;
		}else {
		}
		
	}


	
}
