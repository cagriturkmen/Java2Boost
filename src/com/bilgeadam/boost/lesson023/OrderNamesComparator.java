package com.bilgeadam.boost.lesson023;

import java.util.Comparator;

public class OrderNamesComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareToIgnoreCase(o2);
	}

	

}
