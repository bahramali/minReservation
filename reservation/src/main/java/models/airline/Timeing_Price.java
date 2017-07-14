package models.airline;
import java.time.LocalDateTime;

public class Timeing_Price {
	private double price;
	private LocalDateTime start;
	private Hours duration;

	public Timeing_Price(double price, LocalDateTime start, Hours duration) {
		this.price = price;
		this.start = start;
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public Hours getDuration() {
		return duration;
	}

	public void setDuration(Hours duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return String.format("%-14s%-6s%-8.2f",
				start.toString(),duration,price);
	}
	
}
