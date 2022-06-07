package com.bilgeadam.boost.lesson035.abstractfactorymethod;

public class HSBC implements Bank{
	private String bankName;
	
	
	public HSBC() {
		bankName ="HSBC";
	}


	@Override
	public String getBankName() {
		return bankName;
	}		

}
