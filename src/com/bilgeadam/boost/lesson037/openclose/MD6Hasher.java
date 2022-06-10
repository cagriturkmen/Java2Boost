package com.bilgeadam.boost.lesson037.openclose;

public class MD6Hasher implements PasswordHasher2{

	@Override
	public String hashPassword(String password) {
		return "Hashed with SHA512";
	}

}
