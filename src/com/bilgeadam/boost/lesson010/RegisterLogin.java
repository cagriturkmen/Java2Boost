package com.bilgeadam.boost.lesson010;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) {
		String userName="";
		String password="";
		do {
			System.out.println("1-Kayıt ol\n"+"2-Giriş yap");
			Scanner scan = new Scanner(System.in);
			int key = scan.nextInt();
			
			switch (key) {
			case 1:
				Scanner input = new Scanner(System.in);
				System.out.println("Kullanıcı oluşturma sayfasına hoşgeldiniz. Kullanıcı adınızı griniz:");
				userName = input.nextLine();
				System.out.println("Şifrenizi giriniz:");
				password=  input.nextLine();
				System.out.println("Hesabınız oluşturuldu.");
				break;
			case 2:
				Scanner scanner= new Scanner(System.in);
				System.out.println("Lütfen kullanıcı giriniz: ");
				String userNameEntry = scanner.nextLine();
				System.out.println("Lütfen şifrenizi giriniz:");
				String passwordEntry = scanner.nextLine();
				
				if(userNameEntry.equals(userName) && passwordEntry.equals(password)) {
					System.out.println("Hoşgeldiniz.");
				}else {
					System.out.println("Kullanıcı adınız veya şifreniz yanlış");
				}
				break;


			default:
				break;
			}
			
		} while (true);
		
		
	}

}
