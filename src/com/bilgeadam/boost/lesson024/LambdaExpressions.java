package com.bilgeadam.boost.lesson024;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.bilgeadam.boost.lesson023.OrderNamesComparator;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("cagri","babur","mustafa","muhammed");
		
//		Collections.sort(names, new OrderNamesComparator());
//		
//		System.out.println(names);
	
		//ilk hali
//		Collections.sort(names, (String a, String b) -> {
//		    return a.compareTo(b);
//		});
		
		//tek satır gövdesi olan methodlar için süslü parantezleri ve return keywordunu koymamıza gerek kalmadı.
//		Collections.sort(names,(String a, String b) -> 			
//		a.compareTo(b)
//		);
		
		//Java compiler'ı parametre tiplerini algılayabiliyor. O yüzden data tipini de yazmamıza gerek yok.
		Collections.sort(names,(a,b) -> a.compareTo(b));
		
		System.out.println(names);
		
	}
}
