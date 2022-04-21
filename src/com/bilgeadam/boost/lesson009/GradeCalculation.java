package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
			
		int midterm1,midterm2,final1;
		int grade;
		String letterGrade = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("İlk vize notunu giriniz: ");
		midterm1=scanner.nextInt();
		System.out.println("2. vize notunu giriniz: ");
		midterm2=scanner.nextInt();
		System.out.println("Final notunu giriniz: ");
		final1=scanner.nextInt();
		
		grade= (int) ((midterm1+midterm2)/2 *0.4 + final1*0.6);
		
		//koşul ? doğruysa iki noktanın solu: yanlışsa sağı
		switch ((grade < 50) ? "0:49" : (grade < 60) ? "50:59" : (grade < 70) ? "60:69" : (grade < 80) ? "70:79" : "80:100") {
		case "0:49" :
			letterGrade= "FF";
			break;
		case "50:59" :
			letterGrade = "DD";
			break;
		case "60:69" :
			letterGrade = "CC";
			break;
		case "70:79" :
			letterGrade = "BB";
			break;
		case "80:100" :
			letterGrade = "AA";
			break;

		default:
			System.out.println("Hatalı işlemler yaıpldı.");
			break;
		}
		System.out.println("Notunuz:" + letterGrade);



		
	}

}
