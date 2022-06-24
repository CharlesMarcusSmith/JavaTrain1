package com.qa.inheritance;

public class Vans extends Vehicles {
	private int noOfDoors;
	private int noOfSeats;
	private String wheelBase;
	
	public Vans(String colour, String make, String model, String fuelType, int noOfDoors, int noOfSeats, String wheelBase) {
		super(colour, make, model, fuelType);
		// TODO Auto-generated constructor stub
		this.noOfDoors = noOfDoors;
		this.noOfSeats = noOfSeats;
		this.wheelBase = wheelBase;
	}



	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getWheelBase() {
		return wheelBase;
	}

	public void setWheelBase(String wheelBase) {
		this.wheelBase = wheelBase;
	}



	@Override
	public String toString() {
		return "Vans [make =" + getMake() + ", model = " + getModel() + ", colour= " + getColour() + ", fuelType "+ getFuelType()  
		+ ", noOfDoors=" + noOfDoors + ", noOfSeats=" + noOfSeats + ", wheelBase=" + wheelBase + "]";
	}
	
	public void calculateBill() {
		System.out.println("Vans vills is £150");
	}


	
}
	
	

