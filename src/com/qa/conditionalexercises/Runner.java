package com.qa.conditionalexercises;

public class Runner {
	public static void main(String[] args) {
//		Create a method which accepts 3 parameters, 2 integers and a boolean.
//
//		If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
//		For example:
//
//		Input (1, 2, true) -> 3
//		Input (3, 3, false) -> 9
//		Input (1, 1, true) -> 2
		
		Cond flowA = new Cond();				//new Cond obj 
		
		int res = flowA.flowOne(6,6,false);		//setting value = method is how we catch the return
		System.out.println(res);				//36
		
		res = flowA.flowOne(6,6,true);			//setting a class specifc value = method is how we catch the return
		System.out.println(res);				//12
		
		//flow chart exercise is a flowchart with a series of if > conditions, which cannot be displayed here as it is an image.
		flowA.flowTwo(6000);
		
	}
}
