package com.qa.printexample;

public class FlowOfControl {
String globalVar = "This is known as Class scope, or a class variable";	
	public static void main(String[] args) {
		methodOne();
		System.out.println(methodTwo());
		
		System.out.println("Line 3");
		testScope2();
		globalPrinter();
		
	}
	public static void methodOne() {
	System.out.println("Line 1");
	}
	public static String methodTwo() {
		return "Line 2";
	}
	public static String testScope1() {
		String testVar = "Loco";
		return testVar;
	}
	public static void testScope2() {
		String testThief = testScope1();
		System.out.println("We can only take the value " + testThief + " from the method, not the variable itself");
	}
	public void globalPrinter() {
		System.out.println("We can however print global variables," + globalVar);
	}
	
	
}
