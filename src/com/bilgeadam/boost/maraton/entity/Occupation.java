package com.bilgeadam.boost.maraton.entity;

public enum Occupation {
	
	STUDENT(0), TEACHER(1), OFFICER(2), JANITOR(3), NO_INFO(4);
	
	int occupation;
	
	
	private Occupation(int occupation) {
		this.occupation = occupation;
	}

	public static Occupation stringToOccupation(int i) {
		if (i == 0) {
			return STUDENT;
		}else if (i ==1 ) {
			return TEACHER;
		}else if (i ==2 ) {
			return OFFICER;
		}else if (i ==3 ) {
			return JANITOR;
		}else {
			return NO_INFO;
		}
	}
	
}
