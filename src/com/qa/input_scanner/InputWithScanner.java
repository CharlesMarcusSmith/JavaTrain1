package com.qa.input_scanner;

import java.util.Scanner;

public class InputWithScanner {
	public String calculatorStart() {
//		Create a project that has four methods; addition, subtraction, multiplication, and division.
//		All of these methods should take two numbers as parameters.
//		Create a method to ask the user which of the four methods they wish to use, then take the numbers as user input for the operation and output the result back to the user.#
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		String function;																																										//used for user input
		int func = 0;																																												//here we are going to return the chosen function as an int, to easily avoid issues with multiple data types returned.
		int numA = 0;																																											//number choice one
		int numB = 0;																																											//number choice two
		
		System.out.println(numA);
		System.out.println(numB);
		
		while(flag) {
			System.out.println("Please enter the which function you would like to perform from the following:");
			System.out.println("'Addition', 'Subtraction', 'Multiplication', 'Division'.");
			function = scan.nextLine();
			if(function.equalsIgnoreCase("addition") || function.equalsIgnoreCase("subtraction") || function.equalsIgnoreCase("multiplication") || function.equalsIgnoreCase("division")) {		//checking to see if input is viable(this also works for null).
				System.out.println(function + " accepted.");																																	//feedback to user, mostly for testing purposes.
				//now that we have confirmed input is viable, assinging func variable based on input:
				return function;																																										//exits while loop
			}
			else {																																												//input not viable
				System.out.println("Input not accepted.");																																		//feedback to user, mostly for testing purposes.
				continue;																																										//re-iterates while loop.
			}
		}
		
	public Integer calA() {	
		Scanner scan = new Scanner(System.in);	
		while(flag) {
			System.out.println("Please enter the first number you would like to calculate:");
			String inNumA= scan.nextLine();																																						//taking input as a String
			try {																																												//TRY: used to attempt something, i.e. data type conversion here, with the expectation there may be a fatal error thrown
				numA = Integer.parseInt(inNumA);																																				//Here we are using the Integer.parseInt to switch String to Int, this method is also generally better than nextInt(), which has known errors with the enter key being hit at the end.
				break;																																											//If done sucessfully, without error thrown, this line will activate breaking the WHILE loop.
			}
			catch (NumberFormatException e) {																																					//Here we are catching the expected Java error assiociated with String/int datatype missmatch
				System.out.println("Unfortunately, you have not entered a number, please try again.");
			}
		}
		return numA;
	}
	
	public Integer calB() {		
		Scanner scan = new Scanner(System.in);
		while(flag) {
			System.out.println("Please enter the second number you would like to calculate:");
			String inNumB= scan.nextLine();																																						//taking input as a String
			try {																																												//TRY: used to attempt something, i.e. data type conversion here, with the expectation there may be a fatal error thrown
				numB = Integer.parseInt(inNumB);																																				//Here we are using the Integer.parseInt to switch String to Int, this method is also generally better than nextInt(), which has known errors with the enter key being hit at the end.
				break;																																											//If done sucessfully, without error thrown, this line will activate breaking the WHILE loop.
			}
			catch (NumberFormatException e) {																																					//Here we are catching the expected Java error assiociated with String/int datatype missmatch
				System.out.println("Unfortunately, you have not entered a number, please try again.");
			}
		}
		
		scan.close();
		return func;
		
		return numB;
	}
}
