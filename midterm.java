package com.ebrink.midterm;

import java.util.Scanner;
import java.util.Random;

public class midterm {

//	Create a program that plays a guessing game. 
//	The program will secretly select a number between 
//	1 and 100 (or a 1 and 1000 if you want it to be a little 
//	more challenging.) It will prompt the use for a guess. 
//	The user starts with 10 points and gets 10 guesses. 
//	After each guess the program will tell the user whether 
//	the guess is too high, too low, or correct. If correct the 
//	game end. Each wrong guess subtracts a point. After the last 
//	guess, or a correct guess,  the program prints out the secret 
//	number and the score. This program will test your use of Loops 
//	and branches as well as basic prompts, inputs and assignments. 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int programNum = rand.nextInt(100) + 1;
		int points = 10;
		
		while (points != 0) {
			System.out.println("Enter your guess: ");
			int guess = scan.nextInt();
			if (guess == programNum) {
				System.out.println("You win!");
				break;
			} 
			else if (guess < programNum) {
				points --;
				System.out.println("Too low!");
			}
			else if (guess > programNum) {
				points --;
				System.out.println("Too high!");
			}
		} // end while
		System.out.println("Game is over! The secret number is: " + programNum + " and your score is: " + points + ".");
	}

}
