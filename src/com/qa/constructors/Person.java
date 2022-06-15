package com.qa.constructors;

public class Person {
	public String name;
	public int age;
	public int shoeSize = 10;												//if we call line 15, this will be the default size.
	
	public Person(String inName, int inAge, int inShoeSize) {				//usually these are the same name as the constructor variable as they don't conflict
		this.name = inName;													// i'm using inName etc to make reflection easier in future if needed
		this.age = inAge;
		this.shoeSize = inShoeSize;
	}
	
	//below we are going to demonstrate overloading, which is the same method as Person() above using
	public Person(String inName, int inAge) {								//notice the lack of shoe size
		this.name = inName;													
		this.age = inAge;
	}
}
