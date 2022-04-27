package com.bilgeadam.boost.lesson013;

public class TryThis {
	
	//sınıf değişkeni yarattım
	int variable=15;
	
	public static void main(String[] args) {
		//main Method içerisinde değişkene değer atadım.
		int variable = 10;
		
		//Bu sınıftan bir nesne oluşturdum.
		TryThis tryThis = new TryThis();
		
		tryThis.method(variable);
		
		//Oluşturduğum nesnenin methodunu kullandım. Parametre olarak içinede main methodda değer atadığım değişkeni verdim.
		System.out.println(tryThis.method(20));
		//Main method içinde değerini belirlediğim değişkeni konsola yazdırdım.
		System.out.println(variable);
		//Sınıf içerisinde oluşturduğum değişkeni konsola yazdırdım.
		System.out.println(tryThis.variable);
		
	}
	//Bir metod yarattım.
	int method (int variable) {
			variable +=25;
			//Methodun parametre olarak içine aldığı değeri kullandım.
			System.out.println(variable);
			return this.variable;
	}

}
