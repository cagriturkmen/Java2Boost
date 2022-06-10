package com.bilgeadam.boost.lesson037.dependencyinversion;

import com.bilgeadam.boost.lesson037.openclose.PasswordHasher2;

public class PasswordService2 {

	private PasswordHasher2 passHasher;

	public PasswordService2(PasswordHasher2 passHasher) {
		this.passHasher = passHasher;
	}
	
	void hashPassword(String password) {
		
		this.passHasher.hashPassword(password);
	}
	
	
}
