package com.bilgeadam.boost.lesson015;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		// Scanner'ı oluşturdum. ve hoşgeldiniz mesajı oluşturdum.
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors!");
		int you=0;
		int me=0;
		while(true) {
		//Kullanıcıdan hamlesini istedim ve hamleyi okudum.
		System.out.println("What is your move? rock-paper-scissors-quit");
		String userMove = in.nextLine();
		
		//Kullanıcı çıkmak istiyor mu diye kontrol ediyoruz.
		if(userMove.equals("quit")) {
			System.out.println("See you later!!");
			break;
		}
		//Kullanıcının girişi programın beklentilerine uyuyor mu diye kontrol ediyoruz.
		if(!userMove.equals("rock")&&!userMove.equals("paper")&&!userMove.equals("scissors")) {
			System.out.println("Your move is not valid!");	
		}else {
			//Random bir sayı oluşturdum.
			Random random = new Random();
			int rand = random.nextInt(3);
			
			//Oluşturduğum random sayıya değerler atadım.(Rock-Paper-Scissors)
			String computerMove="";
			
			if(rand==0) {
				computerMove="rock";
			}else if (rand==1) {
				computerMove="paper";
			}else {
				computerMove="scissors";
			}	
			System.out.println("Computer's move: "+ computerMove);
			
			//Oyunun mantığı oluşturuldu. Tie,win,lose
			if(userMove.equals(computerMove)) {
				System.out.println("It's a tie!");
			}else if(userMove.equals("rock")&&computerMove.equals("scissors")|| userMove.equals("scissors")
					&&computerMove.equals("paper")||userMove.equals("paper")&&computerMove.equals("rock")) {
				System.out.println("You won");
				me++;
				System.out.println(me+" "+you);
			}else {
				System.out.println("You lost");
				you++; 
				System.out.println(me+" "+you);
			}
		}
		
	}
	}
}
