package com.bilgeadam.boost.lesson041;

public class User {
	
	public static void main(String[] args) {
				
		User user = new User.UserBuilder("Cagri", "Turkmen")
				.age(30)
				.address("sisli")
				.phone("afsdf")
				.build();
		
		StringBuilder builder = new StringBuilder("Temp");
		String data = builder.append(1).append(true).append("friend").toString();
		System.out.println(data);
		
	}
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	
	
	
	public User(String firstName, String lastName, int age, String phone, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}		
	
	public static class UserBuilder{
		
		private final String firstName;
		private final String lastName;
		private  int age;
		private  String phone;
		private  String address;
		
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		public User build() {
			
			User user = new User(this);
			return user;
			
		}						
	}	
}
