package com.bilgeadam.boost.lesson013.outside;

import com.bilgeadam.boost.lesson013.Test;

public class OutsideAccess extends Test{

	public static void main(String[] args) {
		
		Test testObject = new Test();
		
		//System.out.println("Eriştiğim değişkenler: "+ testObject.publicVariable);
		
		
		OutsideAccess outsideAccess = new OutsideAccess();
		System.out.println("Eriştiğim değişkenler: "+outsideAccess.protectedVariable+","+outsideAccess.publicVariable);
	}

}
