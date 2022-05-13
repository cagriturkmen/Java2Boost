package com.bilgeadam.boost.lesson020.composition;

//Has-A

public class Engine {

	private String type;
	private int horsePower;
	private int cylinderNumber;
	
	public Engine(String type, int horsePower,int cylinderNumber) {
		this.type = type;
		this.horsePower = horsePower;
		this.cylinderNumber = cylinderNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getCylinderNumber() {
		return cylinderNumber;
	}

	public void setCylinderNumber(int cylinderNumber) {
		this.cylinderNumber = cylinderNumber;
	}
	
	
	
	
}
