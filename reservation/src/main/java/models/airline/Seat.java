package models.airline;

import models.TypeOfSeat;

public class Seat {
	private String name;
	private TypeOfSeat typeOfSeat;
	private boolean valid;
	private double price;
	
	public Seat(String name,TypeOfSeat typeOfSeat,double price){
		this.name = name;
		this.typeOfSeat = typeOfSeat;
		this.valid = true;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeOfSeat getTypeOfSeat() {
		return typeOfSeat;
	}

	public void setTypeOfSeat(TypeOfSeat typeOfSeat) {
		this.typeOfSeat = typeOfSeat;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%-4s%-17s%-8.2f", name,typeOfSeat,price);
	}
	
}
