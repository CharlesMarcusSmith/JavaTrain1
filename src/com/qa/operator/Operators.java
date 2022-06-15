package com.qa.operator;

public class Operators {
	public int num1;
	public int num2;
	public void basicMaths(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println("Modulus is %, so the line above is division,");
		System.out.println("but modulus of the same is:" + num1 % num2);			//modulus is the remainder of a division
	}
}
