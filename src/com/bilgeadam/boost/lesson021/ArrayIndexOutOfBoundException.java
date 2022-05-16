package com.bilgeadam.boost.lesson021;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40};
		
		System.out.println(arr.length);
		//Array 4 elemanlı.
		//array'in 4. indexine 5. elemanına ulaşmaya çalıştığımız için "ArrayIndexOutOfBoundsException" aldık.
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}
}
