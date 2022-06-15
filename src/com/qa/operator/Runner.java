package com.qa.operator;

public class Runner {
	public static void main(String[] args) {
		Operators op = new Operators();			//we can only access Basic Maths through an object as it isnt't static, so we create 'op'.
		op.BasicMaths(5, 3); 					//calls that object's method, passing in the values.
	}
}
