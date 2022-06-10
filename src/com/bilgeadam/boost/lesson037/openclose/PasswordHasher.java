package com.bilgeadam.boost.lesson037.openclose;

public class PasswordHasher {
	
	String hashedPassword;
	
	public String hashPassword(String password, HashingType hashingType) {
		
		if(HashingType.BASE64.equals(hashingType)) {
			hashedPassword = "hashed with Base64";
		}else if( HashingType.MD5.equals(hashingType)) {
			hashedPassword = "hashed with MD5";
		}
		return hashedPassword;
	}
	
}
