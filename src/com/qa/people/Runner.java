package com.qa.people;

public class Runner {
	public static void main(String[] args) {
		Person charles = new Person("Charles", 25, "Trainee");
		Person daniel = new Person("Daniel", 26, "Traineee");
		Person emily = new Person("Emily", 26, "Nurse");
		System.out.println(charles.toString());
		
		PersonManager pm = new PersonManager();
		pm.add(charles);
		pm.add(daniel);
		pm.add(emily);
		
		pm.printList();
		
	}
}
