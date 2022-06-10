package com.bilgeadam.boost.lesson037.dependencyinversion;

import com.bilgeadam.boost.lesson037.openclose.Base64Hasher;

public class PasswordService {
	
	private Base64Hasher hasher = new Base64Hasher();
	
	
	void hashPassword(String password) {
		hasher.hashPassword(password);
	}
	
}
