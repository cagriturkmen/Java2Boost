package com.bilgeadam.boost.lesson035.abstractfactorymethod;

public class BusinessLoan  extends Loan{

	@Override
	void getInterestRate(double r) {
		rate = r;		
	}

}
