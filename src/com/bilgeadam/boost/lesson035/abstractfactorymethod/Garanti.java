package com.bilgeadam.boost.lesson035.abstractfactorymethod;

public class Garanti implements Bank{
	
	private String bankName;		
	
	public Garanti() {
		bankName = "Garanti";
	}



	@Override
	public String getBankName() {
		return bankName;
	}

}
