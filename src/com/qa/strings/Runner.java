package com.qa.strings;

public class Runner {
	public static void main(String[] args) {
		String exampleString = new String("Here is an example of a string");
		StringManipulation ex1 = new StringManipulation();
				String temp = ex1.exerciseOne();
				System.out.println(temp);
				System.out.println(ex1.exerciseOneSub(temp));
		StringManipulation ex2 = new StringManipulation();
		ex2.exerciseTwoA(exampleString);
				
	}
	
}
