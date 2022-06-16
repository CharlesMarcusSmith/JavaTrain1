package com.qa.conditionalexercises;

public class Cond {
	int num1;
	int num2;
	boolean bool1;
	int res;
	int num3;
	
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
	
	public void flowTwo(int inNum3) {
		this.num3 = inNum3;
		
		if(num3 > 2000) {
			System.out.println("A");
			if(num3>6000) {
				System.out.println("C");
			}else {
				System.out.println("B");
				if(num3>4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				}
				
			}
			
		} else {
			System.out.println("1");
			if(num3>100) {
				System.out.println("3");
				if(num3>600) {
					System.out.println("5");
				}else {
					System.out.println("4");
					if(num3>500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}				
			}
			else {
				System.out.println("2");
			}
		}
		
		
	}
}
