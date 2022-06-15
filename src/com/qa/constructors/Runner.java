package com.qa.constructors;

public class Runner {
	public static void main(String[] args) {
		Person anoush = new Person("Anoush", 29, 12); //new person object, using constructor on Person.java's line 8
		Person charles = new Person("Charles", 10); //this one is using Person.java's line 15
		// The difference in which overloaded constructor is used is the pattern of values passed,
		// String, int, int vs String, int
		
		System.out.println(anoush.age);
		System.out.println(charles.age);
	}
}
