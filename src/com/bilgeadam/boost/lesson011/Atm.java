package com.bilgeadam.boost.lesson011;

import java.util.Scanner;

public class Atm {
	static Scanner scanner = new Scanner(System.in);
	static int count =3;
	static int balance = 1500;
	static int select;
	static int amount;
	
	public static void main(String[] args) {
		
		
		while(true) {
			count--;
			System.out.println("Lütfen kullanıcı adınızı giriniz: ");
			String userName = scanner.nextLine();
			System.out.println("Lütfen şifrenizi giriniz: ");
			String password = scanner.nextLine();
			
			if(!userName.equals("user") || !password.equals("123")) {
				System.out.println("Hatalı giriş yaptınız");
				
				if(count==0) {
					System.out.println("Kartınıza bloke konulmuştur. Banka ile iletişime geçin");
					break;
				}else {
					System.out.println("Kalan hakkınız: "+ count);
				}
			} else {
				System.out.println("Bankamıza hoşgeldiniz.");
				while(true) {
					System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
					System.out.println("Lütfen bir seçim yapınız.");
					select = scanner.nextInt();
					switch (select) {
					case 1:
						depositMoney();
						break;
					
					case 2:
						withdrawMoney();
						break;
					
					case 3:
						showBalance();
						break;
						
					case 4:
						quit();
						break;
						
					default:
						System.out.println("Geçersiz bir değer girildi.!");
						break;
					}
				}
			}
			
		}
		
	}
	public static void depositMoney() {
		System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
		amount = scanner.nextInt();
		// balance = balance + amount
		balance += amount;
		System.out.println("Hesabınıza "+amount+" TL para yatırılmıştır.");
	}
	public static void withdrawMoney() {
		System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
		amount = scanner.nextInt();
		if(amount>balance) {
			System.out.println("Hesabınızda yeterli miktarda para yok.");
		}else {
			balance -= amount;
			System.out.println("Hesabınıza "+amount+" TL para çekilmiştir.");
		}
	}
	public static void showBalance() {
		System.out.println("Hesabınızda toplam "+ balance+"TL para vardır.");
	}
	public static void quit() {
		System.out.println("Sistemden çıkılıyor...");
		System.exit(0);
	}

}
