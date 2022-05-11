package com.bilgeadam.boost.lesson018;

public class Test {

	public static void main(String[] args) {
		
		//Abstract sınıftan nesne üretmeye çalıştığımız için hata verdi.
		//Employee e = new Employee("Cagri","Sisli",537);
		
		Salary s = new Salary("Cagri","Sisli",537,1000);
		Employee e = new Salary("Ali","Bartın",533,2000);
		s.mailCheck();
		e.mailCheck();
		
		
	}

}
