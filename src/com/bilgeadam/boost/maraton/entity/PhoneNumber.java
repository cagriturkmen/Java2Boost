package com.bilgeadam.boost.maraton.entity;

public class PhoneNumber {
	
	private long homePhoneNumber;
	private long parentPhoneNumber;
	private long mobilePhoneNumber;
	
	
	
	public PhoneNumber(long homePhoneNumber, long mobilePhoneNumber) {
		super();
		this.homePhoneNumber = homePhoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
	}


	public PhoneNumber(long homePhoneNumber, long parentPhoneNumber, long mobilePhoneNumber) {
		super();
		this.homePhoneNumber = homePhoneNumber;
		this.parentPhoneNumber = parentPhoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
	}


	public long getHomePhoneNumber() {
		return homePhoneNumber;
	}


	public long getParentPhoneNumber() {
		return parentPhoneNumber;
	}


	public long getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}


	@Override
	public String toString() {
		return "PhoneNumber [homePhoneNumber=" + homePhoneNumber + ", parentPhoneNumber=" + parentPhoneNumber
				+ ", mobilePhoneNumber=" + mobilePhoneNumber + "]";
	}
	
	
	
}
