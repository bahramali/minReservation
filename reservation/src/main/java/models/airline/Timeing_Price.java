package models.airline;
import java.time.LocalDateTime;

import models.Hours;

public class Timeing_Price {
	private Hours duration;
	private double price;
	private LocalDateTime start;

	public Timeing_Price(double price, LocalDateTime start, Hours duration) {
		this.price = price;
		this.start = start;
		this.duration = duration;
	}

	public Hours getDuration() {
		return duration;
	}

	public double getPrice() {
		return price;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setDuration(Hours duration) {
		this.duration = duration;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	
	@Override
	public String toString() {
		return String.format("%-14s%-6s%-8.2f",
				start.toString(),duration,price);
	}
	
}
