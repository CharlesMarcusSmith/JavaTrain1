package com.qa.inheritance;

public class Runner {
	public static void main(String[] args) {
		//Cars: String colour, String make, String model, String fuelType, int noOfDoors, boolean sunroof, int noOfSeats
		Cars ff1 = new Cars ("Green", "Ford", "Fiesta", "Petrol", 5, true, 5);
		
		//Vans: String colour, String make, String model, String fuelType, int noOfDoors, int noOfSeats, String wheelBase
		Vans cb1 = new Vans("White", "Citeron", "Belingo", "Diesel", 3, 2, "SWB");
		
		//String colour, String make, String model, String fuelType, String engineSize, String catergory
		Bikes kn1 = new Bikes("Green/Black", "Kawasaki", "Ninja", "Petrol", "1000CC", "superbike");
		
		Garage garage = new Garage();
		
		garage.store(ff1);
		garage.store(cb1);
		garage.store(kn1);
		
		ff1.calculateBill();				//calling an inherited method.
		cb1.calculateBill();				//calling an inherited method.
		kn1.calculateBill();				//calling an inherited method.
		
		garage.printStorage();				//calling a method in garage.
		
		garage.removeByType("Cars");		//Calling method in Garage
		garage.printStorage();				//Checking the item was removed.
		
	}
}
