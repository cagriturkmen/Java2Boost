package com.bilgeadam.boost.lesson028;

public abstract class BankAccount implements BankingOperations{
	
	private String accountNumber; 
	private String accountName;
	protected double balance;
	
	
	public BankAccount(String accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = 0;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public String getAccountName() {
		return accountName;
	}


	public double getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
				+ "]";
	}
	
	
	
	
}
