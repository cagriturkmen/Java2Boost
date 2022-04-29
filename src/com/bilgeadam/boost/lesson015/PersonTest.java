package com.bilgeadam.boost.lesson015;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Person person1 = new Person("Babur","Somer","M",50);
		
		Person nonGenderPerson = new Person("Cagri","Turkmen",25);
		
		//Person person2 = new Person("Cagri","Türkmen");
		
		person.setName("Cagri");
		person.setAge(29);
		person.setLastname("Turkmen");
		person.setGender("M");
		
		System.out.println(person);
		System.out.println(person1);
		System.out.println(nonGenderPerson);
		
	}

}
