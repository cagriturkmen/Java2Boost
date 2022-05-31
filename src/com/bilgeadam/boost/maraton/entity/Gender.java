package com.bilgeadam.boost.maraton.entity;

public enum Gender {
	
	MAN(1), WOMAN(0), NO_INFO(2);
	
	int gender;

	private Gender(int gender) {
		this.gender = gender;
	}
	
	public static Gender stringToGender(int i) {
		if (i == 0) {
			return WOMAN;
		}else if (i ==1 ) {
			return MAN;
		}else {
			return NO_INFO;
		}
	}

}
