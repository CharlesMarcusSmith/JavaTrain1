package com.qa.conditionalexercises;

public class Cond {
	int num1;
	int num2;
	boolean bool1;
	int res;
	
	public int flowOne (int inNum1, int inNum2, boolean inBool) {
		this.num1 = inNum1;
		this.num2 = inNum2;
		this.bool1 = inBool;
		
		
		if (bool1 == true) {
			res = num1 + num2;
		} else if (bool1 == false) {
			res = num1*num2;
		}
		return res;
	}
}
