package com.qa.inheritance;

public abstract class Vehicles {
//Made abstract for abstract CalculateBill(), and because we are never going to call an Vehicle object.
	private String colour;
	private String make;
	private String model;
	private String fuelType;
	
	public Vehicles(String colour, String make, String model, String fuelType) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.fuelType = fuelType;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String toString() {
		return "Vehicles [colour=" + colour + ", make=" + make + ", model=" + model + ", fuelType=" + fuelType + "]";
	}
	
	//Calculate bill parent method we plan to override with the children
	//This has been made abstract as we are never going to call this from a vehicle class, and it would not have any plausible functionality.
	public abstract void calculateBill();
}
