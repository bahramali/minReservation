package models.airline;

import models.Hours;

public class Duration_Price {
	private double price;
	private Hours duration;

	public Duration_Price(double price, Hours duration) {
		this.price = price;
		this.duration = duration;
	}

	public Hours getDuration() {
		return duration;
	}

	public double getPrice() {
		return price;
	}

	public void setDuration(Hours duration) {
		this.duration = duration;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-14s%-8.2f",duration,price);
	}
	
}
