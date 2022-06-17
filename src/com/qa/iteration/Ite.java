package com.qa.iteration;

public class Ite {
		
	public void iteOne() {
		
		for(int A = 100; A >= 200; A++) {
			System.out.println("A");
		}
	}
	
	public void iteTwo() {
		int A = 100;
			if(A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			A++;
		}	
}
