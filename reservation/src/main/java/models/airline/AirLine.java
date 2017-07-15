package models.airline;

import java.util.*;


public class AirLine {
	private List<AirCraft> airCrafts = new ArrayList<AirCraft>();
	private List<City> cities = new ArrayList<City>();
	private String name;
	

	public AirLine(String name){
		this.name = name;
		cities = FlightTable.initialCities();
		
	}
	
	public AirLine(String name,AirCraft airCraft){
		this.name = name;
		addAirCraft(airCraft);
		cities = FlightTable.initialCities();
	}
	public AirLine(String name,List<AirCraft> airCrafts){
		this.name = name;
		airCrafts = new ArrayList<>(airCrafts);
		cities = FlightTable.initialCities();
	}
	
	public void addAirCraft(AirCraft aircraft){
		airCrafts.add(aircraft);
	}

	public List<City> addCitiy(City city) {
		cities.add(city);
		return new ArrayList<City>(cities);
	}

	public List<City> addCity(String city) {
		cities.add(new City(city));
		return new ArrayList<City>(cities);
	}

	public List<AirCraft> getAirCrafts() {
		return new ArrayList<AirCraft>(airCrafts);
	}

	public List<City> getAllCities() {
		return new ArrayList<City>(cities);
	}

	public String getName() {
		return name;
	}

	public void setAirCrafts(List<AirCraft> airCrafts) {
		this.airCrafts = airCrafts;
	}

	public void setAllCities(List<City> someCities) {
		cities = someCities;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
