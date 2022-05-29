package com.bilgeadam.boost.lesson028;

import java.util.List;

public class Bank {
	
	String name;
	List<BankAccount> accounts;
	
	
	public Bank(String name, List<BankAccount> accounts) {
		super();
		this.name = name;
		this.accounts = accounts;
	}
	
	
	public String getName() {
		return name;
	}
	public List<BankAccount> getAccounts() {
		return accounts;
	}


	@Override
	public String toString() {
		return "Bank [name=" + name + ", accounts=" + accounts + "]";
	}
	
	
	
	
	
}
