package com.qa.operator;

public class Operators {
	public int num1 = 5;
	public int num2 = 3;
	
	public void BasicMaths() {
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println("Modulus is %, so the line above is division,");
		System.out.println("but modulus of the same is:" + num1 % num2);
	}
}
