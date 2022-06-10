package com.bilgeadam.boost.lesson037.openclose;

public class Base64Hasher implements PasswordHasher2 {

	@Override
	public String hashPassword(String password) {
		return "hashed with Base64";
	}

}
