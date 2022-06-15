package com.qa.calculatorexercise;

public class Calculator {
	int numA;
	int numB;
	
	public void Calculations(int numA, int numB){
		this.numA = numA;
		this.numB = numB;
		System.out.println("Multiplication of " + numA + " and " + numB + " equals " + (numA*numB));
		System.out.println("Subtraction of " + numA + " and " + numB + " equals " + (numA-numB));
		double numA1 = numA;
		double numB1 = numB;
		System.out.println("Multiplication of " + numA1 + " and " + numB1 + " equals " + (numA1/numB1));
	}
	
}
