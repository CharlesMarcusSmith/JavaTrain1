package com.qa.input_scanner;

import java.util.Scanner;

public class InputWithScanner {
	public void calculatorInput() {
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		String function;																																										//used for user input
		int func;																																												//here we are going to return the chosen function as an int, to easily avoid issues with multiple data types returned.
		int numA;																																												//number choice one
		int numB;																																												//number choice two
		
		while(flag) {
			System.out.println("Please enter the which function you would like to perform from the following:");
			System.out.println("'Addition', 'Subtraction', 'Multiplication', 'Division'.");
			function = scan.nextLine();
			if(function.equalsIgnoreCase("addition") || function.equalsIgnoreCase("subtraction") || function.equalsIgnoreCase("multiplication") || function.equalsIgnoreCase("division")) {		//checking to see if input is viable(this also works for null).
				System.out.println(function + " accepted.");																																	//feedback to user, mostly for testing purposes.
				//now that we have confirmed input is viable, assinging func variable based on input:
				if(function.equalsIgnoreCase("addition")) {
					func = 1;
				}
				if(function.equalsIgnoreCase("subtraction")) {
					func = 2;
				}
				if(function.equalsIgnoreCase("multiplication")) {
					func = 3;
				}
				if(function.equalsIgnoreCase("division")) {
					func = 4;
				}
				
				break;																																											//exits while loop
			}
			else {																																												//input not viable
				System.out.println("Input not accepted.");																																		//feedback to user, mostly for testing purposes.
				continue;																																										//re-iterates while loop.
				
			}
		}
		
		
		while(flag) {
			boolean NumANumeric;
			System.out.println("Please enter the first number you would like to use.");
			numA = Integer.parseInt(scan.nextLine());
			if(numA == null) {//FIX ME
				System.out.println("You have not entered anything.");
				continue;
			}
			else { 
			
		}
		
		scan.close();
	}
}
