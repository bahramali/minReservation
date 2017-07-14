package models.reservation;

import java.time.*;

import models.airline.*;

public class Flight {
	
	private City from;
	private City to;
	private LocalDateTime dateTime;
	
	public Flight(City from, City to,LocalDateTime dateTime) {	
		this.dateTime = dateTime;
		this.from = from;
		this.to = to;
	}

	public City getFrom() {
		return from;
	}

	public void setFrom(City from) {
		this.from = from;
	}

	public City getTo() {
		return to;
	}

	public void setTo(City to) {
		this.to = to;
	}
	
	@Override
	public String toString() {
		return String.format("%-8s%-8s%-8s", from,to,dateTime.toString());
	}

}
