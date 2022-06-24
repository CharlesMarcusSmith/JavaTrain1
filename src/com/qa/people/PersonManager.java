package com.qa.people;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	// encapsulate, then variable name = value
	private List<Person> listOfPeople = new ArrayList<>();
	
	//Adding
	public void add(Person input) {					//takes a person object
		listOfPeople.add(input);
	}
	
	//printing
	public void printList() {
		System.out.println(listOfPeople);
	}
	
	//searching the list
	public void search(String name) {
		for(Person person : listOfPeople) { 			//enhanced for loop, as we don't stop every time we 
			if(person.getName().equals(name)) {			//her we are comparing the search result with the 
				System.out.println("Person found");
				//We will get multiple results for the same name,
				//so in order to store the results, we need to return a list.
			}
		}
	}
}
