package com.qa.calculatorexercise;

public class Calculator {
	int numA;																																				//double used as int rounds down decimals
	int numB;
	String name; 
	double phyR; 
	double chemR;
	double bioR;
	double totalR;
	double phyP; 
	double chemP;
	double bioP;
	double totalP;
	
	
	public void summ(int numA, int numB){
		this.numA = numA;
		this.numB = numB;
		System.out.println("Sum of " + numA + " and " + numB + " equals " + (numA+numB));
	}
	public void mult(int numA, int numB){
		this.numA = numA;
		this.numB = numB;
		System.out.println("Multiplication of " + numA + " and " + numB + " equals " + (numA*numB));
	}
	
	public void subt(int numA, int numB){
		this.numA = numA;
		this.numB = numB;
		System.out.println("Subtraction of " + numA + " and " + numB + " equals " + (numA-numB));
	}
	
	public void divi(int numA, int numB){																													//combination of operations and conditionals exercise
		this.numA = numA;
		this.numB = numB;
		if (numA<numB){
			System.out.println("Division of " + numA + " and " + numB + " equals " + (numA/numB));
		} else {
			System.out.println("Unfortunately the numbers you have entered cannot be divided, as " + numA + " is bigger than " + numB);			
		}
	}	
	
	public void resultsReceived(String name, double phyR, double chemR, double bioR) {
		this.name = name;
		this.phyR = phyR;
		this.chemR = chemR;
		this.bioR = bioR;
		this.totalR = phyR + chemR + bioR;
		
		System.out.println(name + "'s results are as follows:");
		System.out.println("Physics:" + phyR + "/150.");
		System.out.println("Chemistry:" + chemR + "/150.");
		System.out.println("Biology:" + bioR + "/150.");
		System.out.println("Total:" + totalR);
		System.out.println("");
	}
	
	public void resultsPercentage() {
		phyP =  Math.round((phyR/150)*100); 
		chemP = Math.round((chemR/150)*100);
		bioP = Math.round((bioR/150)*100);
		totalP = Math.round((totalR/450)*100);
		System.out.println(name + "'s result percentages are as follows:");
		System.out.println("Physics:" + phyP + "%.");
		System.out.println("Chemistry:" + chemP + "%.");
		System.out.println("Biology:" + bioP + "%.");
		System.out.println("Total:" + totalP + "%.");
		System.out.println();
	}
	public void grade() {
		System.out.println(name + "'s grades are as follows:");
		if (phyP >= 60.0) {
			System.out.println("Physics: PASS");
		} else if (phyP >= 60.0) {
			System.out.println("Physics: FAIL");
		}
		if (chemP >= 60.0) {
			System.out.println("Chemistry: PASS");
		} else {
			System.out.println("Chemistry: FAIL");
		}
		if (bioP >= 60.0) {
			System.out.println("Biology: PASS");
		} else {
			System.out.println("Biology: FAIL");
		}
		if (phyP >= 60.0 && chemP >= 60.0 && bioP >= 60.0) {
			System.out.println("Therefore, overall " + name + " has passed.");
		} else {
			System.out.println("Therefore, overall " + name + " has failed.");
		}
		System.out.println();
	}
	
	
	
}
