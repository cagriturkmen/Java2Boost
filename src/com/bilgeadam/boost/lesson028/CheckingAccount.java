package com.bilgeadam.boost.lesson028;

public class CheckingAccount extends BankAccount  {

	public CheckingAccount(String accountNumber, String accountName) {
		super(accountNumber, accountName);
	
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance +amount;
		}else {
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Fakirsin.");
		}else {
			balance = balance - amount;
		}
		
	}

}
