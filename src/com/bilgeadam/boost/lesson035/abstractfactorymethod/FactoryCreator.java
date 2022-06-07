package com.bilgeadam.boost.lesson035.abstractfactorymethod;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("Bank")){
			return new BankFactory();
		}else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
	
}
