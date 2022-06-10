package com.bilgeadam.boost.lesson037.openclose;

public class MD5Hasher implements PasswordHasher2{

	@Override
	public String hashPassword(String password) {
		
		return "hashed with SHA256";
	}

}
