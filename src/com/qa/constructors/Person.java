package com.qa.constructors;

public class Person {
	public String name;														//Non-static, only exsists in the object itself.
	public int age;
	public int shoeSize = 10;												//if we call line 15, this will be the default size.
	public static int numOfPeople = 0;										//static variable = exsists in the class not the object.
	
	public Person(String inName, int inAge, int inShoeSize) {				//usually these are the same name as the constructor variable as they don't conflict
		this.name = inName;													// i'm using inName etc to make reflection easier in future if needed
		this.age = inAge;
		this.shoeSize = inShoeSize;
		System.out.println("Person created");
		numOfPeople ++;
	}
	
	//below we are going to demonstrate overloading, which is the same method as Person() above using
	public Person(String inName, int inAge) {								//notice the lack of shoe size
		this.name = inName;													
		this.age = inAge;
	}
}
