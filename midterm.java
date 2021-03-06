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
//	You can work on the program until it works--there is no 
//	time limit despite the due date.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) { // to repeat the game until user is done playing
		int programNum = rand.nextInt(100) + 1; // program picks random num between 1-100
		int points = 10; // user gets 10 guesses, guesses = points
		
		while (points != 0) { // while user still has guesses available
			System.out.println("Enter your guess: ");
			int guess = scan.nextInt();

			if (guess < programNum) { // if guess is too low
				points --;
				System.out.println("Too low!");
			}
			else if (guess > programNum) { // if guess is too high
				points --;
				System.out.println("Too high!");
			}
			else { // if guess is correct
				System.out.println("You win!");
				break;
			} 
		} // end while
		System.out.println("Game is over! The secret number is: " + programNum + " and your score is: " + points + "."); // after correct or last guess
		System.out.println("Would you like to play again? Enter 'Y' if yes, type anything else if no."); // does user want to play again?
		String playAgain = scan.next();
		if (playAgain.equalsIgnoreCase("Y")) { // if user wants to play again
			System.out.println("Let's do this again!");
		} else { // if user does not want to play again
			System.out.println("See ya later!");
			break; // break the game play repeat loop to end game
		}
		}
	}

}
