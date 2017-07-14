package models.airline;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

import models.reservation.Flight;

public class FlightTable {
	private AirLine airLine; 
	private Map<Flight,Timeing_Price> flightTable;
	
	public FlightTable(AirLine airLine,Map<Flight,Timeing_Price> flightTable){
		this.airLine = airLine;
		this.flightTable = flightTable;
	}

	public FlightTable(AirLine airLine){
		this.airLine = airLine;
		flightTable = new HashMap<Flight,Timeing_Price>();
	}
	
	
	public AirLine getAirLine()
	{
		return airLine;
	}

	public void setAirLine(AirLine airLine)
	{
		this.airLine = airLine;
	}

	public Map<Flight, Timeing_Price> getFlightTable()
	{
		return new HashMap<Flight,Timeing_Price>(flightTable);
	}

	public void setFlightTable(Map<Flight, Timeing_Price> flightTable)
	{
		this.flightTable = flightTable;
	}

	public static List<City> initialCities(){
		List<City> cities = new ArrayList<City>();
		
		Arrays.asList(TimeZone.getAvailableIDs()).stream().
		filter(t -> t.length()%4==0).collect(Collectors.toList()).
		forEach(s -> {
			if(s.toLowerCase().contains("europe"))
				cities.add(new City(s.substring(s.indexOf("/")+1)));
		} );
		return cities;	
	}
	
	
	private Map<Flight,Timeing_Price> initialTableFlights(AirLine airLine) {
		
		List<City> cites = airLine.getAllCities();
		
		List<Flight> flights = new ArrayList<Flight>();
		
		flights.add(new Flight(cites.get(0),cites.get(1),LocalDateTime.of(LocalDate.of(2017, 10, 10), LocalTime.of(14, 30))));
		flights.add(new Flight(cites.get(2),cites.get(3),LocalDateTime.of(LocalDate.of(2017, 10, 10), LocalTime.of(14, 30))));
		flights.add(new Flight(cites.get(4),cites.get(5),LocalDateTime.of(LocalDate.of(2017, 10, 10), LocalTime.of(14, 30))));
		flights.add(new Flight(cites.get(6),cites.get(7),LocalDateTime.of(LocalDate.of(2017, 10, 10), LocalTime.of(14, 30))));
		
		return new HashMap<Flight,Timeing_Price>();
	}

}
