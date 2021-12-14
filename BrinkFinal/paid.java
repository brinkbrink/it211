package com.BrinkFinal;

import java.util.Scanner;

public class paid {
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter amount of hours: ");
	double amountHours = scnr.nextDouble();
	System.out.println("Enter rate: ");
	double amountRate = scnr.nextDouble();
	
	paycheck paycheck1 = new paycheck(amountHours, amountRate);
	
	paycheck1.printCheck();
}
}
