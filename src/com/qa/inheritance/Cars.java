package com.qa.inheritance;

public class Cars extends Vehicles {
	private int noOfDoors;
	private boolean sunroof;
	private int noOfSeats;
	
	public Cars(String colour, String make, String model, String fuelType, int noOfDoors, boolean sunroof, int noOfSeats) {
		super(colour, make, model, fuelType);
		// TODO Auto-generated constructor stub
		this.noOfDoors = noOfDoors;
		this.sunroof = sunroof;
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	//To String, 2 ways to do the toPrint method for a child class:
	//First method - using inherited methods
	public String toString() {
		return "Cars [make =" + getMake() + ", model = " + getModel() + ", colour= " + getColour() + ", fuelType "+ getFuelType()  
		+ ", noOfDoors=" + noOfDoors + ", sunroof=" + sunroof + ", noOfSeats=" + noOfSeats + "]";
	}
	
	//Second method (better for bigger numbers of classes) - super.toString
	
//		return super.toString() + 
	
	public void calculateBill() {
		System.out.println("Car bill is £100");
	}
}
	
