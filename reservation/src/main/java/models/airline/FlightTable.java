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
	private Map<Flight,Duration_Price> flightTable;

	public FlightTable(AirLine airLine){
		this.airLine = airLine;
		flightTable = new HashMap<Flight,Duration_Price>();
	}

	public FlightTable(AirLine airLine,Map<Flight,Duration_Price> flightTable){
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

	public Map<Flight, Duration_Price> getFlightTable()
	{
		return new HashMap<Flight,Duration_Price>(flightTable);
	}

	public void setFlightTable(Map<Flight, Duration_Price> flightTable)
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
	
	public static List<CityTimeTable> initialCityTimeTable(AirLine airLine){
		List<City> cities = airLine.getAllCities();
		List<CityTimeTable> cityTimeTable= new ArrayList<CityTimeTable>();

		int count = 0;
		for (City i:cities) {
			for(City j:cities) {
				if(i.getName().equals(j.getName())) {
//					System.out.printf("0000_0000  ");
				}else {				
					cityTimeTable.add(new CityTimeTable(i, j,initialDayTime(airLine).get(count++)));
//					System.out.printf("%-4s_%-4s  ",i.getName(),j.getName());
				}
			}
//			System.out.println();
		}
		cityTimeTable.sort((c1,c2)->c1.getCity1().getName().compareTo(c2.getCity1().getName()));
		return cityTimeTable;
	}
	
	public static Map<Flight,Duration_Price> initialTableFlights(AirLine airLine) {
		List<City> cities = airLine.getAllCities();
		List<CityTimeTable> cityTable = new ArrayList<CityTimeTable>();


		return new HashMap<Flight,Duration_Price>();
	}

}
