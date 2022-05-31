package com.bilgeadam.boost.maraton.entity;

public enum MarriageStatus {

	MARRIED(0), SINGLE(1), NO_INFO(2);
	
	int marriageStatus;

	private MarriageStatus(int marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	
	public static MarriageStatus stringToMarriageStatus(int i) {
		if (i == 0) {
			return MARRIED;
		}else if (i ==1 ) {
			return SINGLE;
		}else {
			return NO_INFO;
		}
	}
	
}
