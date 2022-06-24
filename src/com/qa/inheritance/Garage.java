package com.qa.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicles> storage = new ArrayList<>();
	
	//Adding input to the list
	public void store (Vehicles input) {
		storage.add(input);
	}
	
	//printing
	public void printStorage() {
//		for(int i = 0; i < storage.size(); i++) {													
//			System.out.println(storage.get(i));
//			//here we are cycling but have used the wrong loop
//		}
		for(Vehicles vehicle : storage) {								//We are using the parent Class name, despite not making vehicle objects, as child objects can be reffered to as both their own Class name and their parents Class name.
			System.out.println(vehicle);
		}
	}
	
	public void calculateBills() {
		for(Vehicles vehicle : storage) {
			vehicle.calculateBill();
		}
	}
	
	public void removeByType(String type) {
		List<Vehicles> toBeRemoved = new ArrayList<>();					//Used to store what is to be removed post-loop.
		for(Vehicles vehicle : storage) {
			if(vehicle.getClass().getSimpleName().equals(type)) {		//Method used to get the class. Converts is to a string. Then compares it. 
				toBeRemoved.add(vehicle);
			}
		}
	//"ConcurrentModificationException"
	//this throws us an exception, which when googles, is thrown because we are removing the item we are looking at.
	//an arrat list changes size, which means when we delete, its length reduces.
	//We cannot delete from an array list while we are looping through it, because the size will change mid-loop and it won't know where it is going etc..
		for(Vehicles vehicle : toBeRemoved) {
			storage.remove(vehicle);									//This is fine as we are not looping through storage, but the new 'toBeRemoved' list.
			System.out.println("Vehicle removed.");
		}
	}
	
	public void emptyGarage() {
		storage.clear();
		
	}
	
		
}
