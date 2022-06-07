package com.bilgeadam.boost.lesson035.abstractfactorymethod;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		
		if(loan == null) {
		return null;
		}
		if(loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		}else if(loan.equalsIgnoreCase("Business")) {
			return new BusinessLoan();
		}else if(loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
	return  null;
	}

}
