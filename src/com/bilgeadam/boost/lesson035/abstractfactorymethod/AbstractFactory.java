package com.bilgeadam.boost.lesson035.abstractfactorymethod;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bank);
	
	public abstract Loan getLoan(String loan);
	
}
