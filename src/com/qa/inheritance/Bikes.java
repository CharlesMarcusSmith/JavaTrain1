package com.qa.inheritance;

public class Bikes extends Vehicles {
	private String engineSize;
	private String catergory;
	
	public Bikes(String colour, String make, String model, String fuelType, String engineSize, String catergory) {
		super(colour, make, model, fuelType);
		// TODO Auto-generated constructor stub
		this.engineSize = engineSize;
		this.catergory = catergory;
	}

	
	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public String getCatergory() {
		return catergory;
	}

	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}


	@Override
	public String toString() {
		return "Bikes [make =" + getMake() + ", model = " + getModel() + ", colour= " + getColour() 
		+ ", fuelType "+ getFuelType()  + ", engineSize=" + engineSize + ", catergory=" + catergory + "]";
	}

	public void calculateBill() {
		System.out.println("Bikes bill is 	£50");
	}
	
}
	
	

