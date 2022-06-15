package com.qa.calculatorexercise;

public class Calculator {
	int numA;
	int numB;
	String name; 
	double phyR; 
	double chemR;
	double bioR;
	double total;
	
	
	public void Calculations(int numA, int numB){
		this.numA = numA;
		this.numB = numB;
		System.out.println("Multiplication of " + numA + " and " + numB + " equals " + (numA*numB));
		System.out.println("Subtraction of " + numA + " and " + numB + " equals " + (numA-numB));
		double numA1 = numA;
		double numB1 = numB;
		System.out.println("Multiplication of " + numA1 + " and " + numB1 + " equals " + (numA1/numB1));
		System.out.println("");
	}
	
	
	public void ResultsReceived(String name, double phyR, double chemR, double bioR) {
		this.name = name;
		this.phyR = phyR;
		this.chemR = chemR;
		this.bioR = bioR;
		this.total = phyR + chemR + bioR;
		
		System.out.println(name + "'s results are as follows:");
		System.out.println("Physics:" + phyR + "/150.");
		System.out.println("Chemistry:" + chemR + "/150.");
		System.out.println("Biology:" + bioR + "/150.");
		System.out.println("Total:" + total);
		System.out.println("");
	}
	
	public void ResultsPercentage() {
		System.out.println(name + "'s result percentages are as follows:");
		System.out.println("Physics:" + Math.round((phyR/150)*100));
		System.out.println("Chemistry:" + Math.round((chemR/150)*100));
		System.out.println("Biology:" + Math.round((bioR/150)*100));
		System.out.println("Total:" + Math.round((total/450)*100));
		System.out.println();
	}
	
}
