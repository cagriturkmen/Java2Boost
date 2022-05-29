package com.bilgeadam.boost.lesson028;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		SavingsAccount saving = new SavingsAccount("14609000", "Cagri's saving account", 14);
		saving.deposit(500);
		
		System.out.println("Before adding interest: "+saving.getBalance());
		saving.addInterest();
		System.out.println("After adding interest: "+ saving.getBalance());
		
		CheckingAccount checking = new CheckingAccount("202205", "Cagri's checking account");
		checking.deposit(1000);
		checking.withdraw(200);
		System.out.println(checking.getBalance());
		
		List<BankAccount> accountList = new ArrayList<>();
		accountList.add(checking);
		accountList.add(saving);
		
		Bank bank = new Bank("Garanti",accountList);
		
		System.out.println(bank);
		
		
	}

}
