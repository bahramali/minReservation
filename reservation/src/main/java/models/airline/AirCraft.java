package models.airline;

import java.util.*;

import models.TypeOfSeat;

public class AirCraft {
	private final String model;
	private final String flightNumber;
	
	private int numOfFSeat;
	private int numOfESeat;
	private double FPrice;
	private double EPrice;
	
	private List<Seat> seats;
	
	public AirCraft(int numOfFSeat, int numOfESeat, double FPrice,double EPrice,String model,String flightNumber){
		seats = gernerateListOfSeat(numOfFSeat,numOfESeat,FPrice,EPrice);
		this.EPrice = EPrice;
		this.FPrice = FPrice;
		this.model = model;
		this.flightNumber = flightNumber;
		this.numOfESeat = numOfESeat;
		this.numOfFSeat = numOfFSeat;
	}
	
	public int getNumOfFSeat() {
		return numOfFSeat;
	}

	public void setNumOfFSeat(int numOfFSeat) {
		this.numOfFSeat = numOfFSeat;
	}

	public int getNumOfESeat() {
		return numOfESeat;
	}

	public void setNumOfESeat(int numOfESeat) {
		this.numOfESeat = numOfESeat;
	}

	public double getFPrice() {
		return FPrice;
	}

	public void setFPrice(double fPrice) {
		FPrice = fPrice;
	}
	
	public double getEPrice() {
		return EPrice;
	}

	public void setEPrice(double ePrice) {
		EPrice = ePrice;
	}

	public List<Seat> getSeats() {
		return new ArrayList<Seat>(seats);
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public String getModel() {
		return model;
	}

	public String getFlightNumber() {
		return flightNumber;
	}
	
	@Override
	public String toString() {
		return flightNumber;
	}
	
	private List<Seat> gernerateListOfSeat(int numOfFSeat,int numOfESeat,double FPrice,double EPrice){
		
		seats = new ArrayList<Seat>(numOfFSeat+numOfESeat);		
		int row = 1;
		for(int i = 0;i<numOfFSeat;i++){
			char n =(char) ('A'+(i%2));
			seats.add(new Seat((n+""+row),TypeOfSeat.FIRST_CLASS,FPrice));
			if((i+1)%2 ==0)
				row++;
		}
		for(int i =numOfFSeat ;i<numOfFSeat+numOfESeat;i++){
			char n =(char) ('A'+(i%4));
			seats.add(new Seat((n+""+row),TypeOfSeat.ECONOMY_CLASS,EPrice));
			if((i+1)%4 ==0)
				row++;
		}
		return seats;
	}
}
