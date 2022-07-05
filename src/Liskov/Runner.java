package Liskov;

public class Runner {
	public static void main(String[] args) {
//		These classes violate the Liskov Substitution Principle because BedroomAdder.java seems like it accepts any object of type Apartment which is fed into it, but actually checks the sub-class of the object to ensure that no object of type Studio is upgraded.
//
//		Refactor the program using the following three classes to ensure that it adheres to the Liskov Substitution Principle to complete this exercise:
//
//		BedroomAdder.java
//		Penthouse.java
//		Studio.java
//		
//		These classes violate the Liskov Substitution Principle because BedroomAdder.java seems like it accepts any object of type Apartment which is fed into it, but actually checks the sub-class of the object to ensure that no object of type Studio is upgraded.
//
//		Refactor the program using the following three classes to ensure that it adheres to the Liskov Substitution Principle to complete this exercise:
//
//		BedroomAdder.java
//		Penthouse.java
//		Studio.java
		
//		1s been done using a interface called BedroomAddable, which is only implemented in Penthouse, as Studio cannot implement this, and Apartment cannot implement this as a parent of Studio.
	}
}
