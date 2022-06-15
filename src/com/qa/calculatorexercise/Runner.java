package com.qa.calculatorexercise;

public class Runner {
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		ca.Calculations(5,3);
		
		Calculator s1 = new Calculator();
		s1.ResultsReceived("Charles", 75, 64, 25);
		s1.ResultsPercentage();
	}
	
	
}
