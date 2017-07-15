package models.airline;

import java.time.DayOfWeek;
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

import javafx.util.converter.LocalDateStringConverter;
import models.WeekDays_Time;
import models.reservation.Flight;

public class FlightTable {
	private AirLine airLine;
	private Map<Flight,Timeing_Price> flightTable;
	
	public FlightTable(AirLine airLine){
		this.airLine = airLine;
		flightTable = new HashMap<Flight,Timeing_Price>();
	}
	
	public FlightTable(AirLine airLine,Map<Flight,Timeing_Price> flightTable){
		this.airLine = airLine;
		this.flightTable = flightTable;
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
		List<String> stringCities = new ArrayList<String>(Arrays.asList(TimeZone.getAvailableIDs()));
	
		List<City> cities = new ArrayList<City>();
		
		stringCities.removeIf(s -> !s.toLowerCase().contains("europe"));
		stringCities.replaceAll(s ->{return s.substring(s.indexOf("/")+1);});
		
		stringCities
		.stream()
		.filter(t -> (t.length()%2==0))
		.filter(t ->t.length()<6)
		.collect(Collectors.toList())
		.forEach(s -> {
			cities.add(new City(s));
		} );
		
		return new ArrayList<City>(cities);	
	}

	public static List<WeekDays_Time> initialDayTime(AirLine airLine) {
		List<City> cities = airLine.getAllCities();
		List<WeekDays_Time> dayTime = new ArrayList<WeekDays_Time>();
		
		for (int i = 0;i<(cities.size()*(cities.size()-1))/3+(cities.size()*(cities.size()-1)%3);i++ ) {
			dayTime.add(new WeekDays_Time(DayOfWeek.of(i%7+1), LocalTime.of(((int)(Math.random()*5)+9), ((int)(Math.random()*12)*5))));
			dayTime.add(new WeekDays_Time(DayOfWeek.of(i%7+1), LocalTime.of(((int)(Math.random()*5)+14), ((int)(Math.random()*12)*5))));
			dayTime.add(new WeekDays_Time(DayOfWeek.of(i%7+1), LocalTime.of(((int)(Math.random()*5)+19), ((int)(Math.random()*12)*5))));
		}
		dayTime.sort((a,b)->a.getDayOfWeek().compareTo(b.getDayOfWeek()));
		return dayTime;
	}
	
	public static Map<Flight,Timeing_Price> initialTableFlights(AirLine airLine) {
		List<City> cities = airLine.getAllCities();
		

		List<CityTimeTable> cityTable = new ArrayList<CityTimeTable>();
		
//		cityTable.add(new CityTimeTable(cities.get(0), cities.get(1), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(0), cities.get(2), departureTiming.get(1), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(0), cities.get(3), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(1), cities.get(0), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(1), cities.get(2), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(1), cities.get(3), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(2), cities.get(0), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(2), cities.get(1), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(2), cities.get(3), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(3), cities.get(0), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(3), cities.get(1), departureTiming.get(0), arrivlTiming.get(0)));
//		cityTable.add(new CityTimeTable(cities.get(3), cities.get(2), departureTiming.get(0), arrivlTiming.get(0)));
		
		
//		List<Flight> flights = new ArrayList<Flight>();
//		
//		for(int i = 0;i< cities.size()-1;i++) {
//			flights.add(new Flight(cities.get(i),cities.get(i+1),LocalDateTime.of(LocalDate.of(2017, 10, 10), LocalTime.of(14, 30))));
//			
//		}
//		flights.add(new Flight(cities.get(2),cities.get(3),LocalDateTime.of(LocalDate.of(2017, 10, 10), LocalTime.of(14, 30))));
//		flights.add(new Flight(cities.get(4),cities.get(5),LocalDateTime.of(LocalDate.of(2017, 10, 10), LocalTime.of(14, 30))));

		
		return new HashMap<Flight,Timeing_Price>();
	}

}
