package models.airline;

import java.time.LocalTime;
import java.util.TimeZone;

public class City {
	private String name;
	private LocalTime localTime;
	
	public City(String name){
		this.name = name;
		this.localTime = getLocalTime(this.name);
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getLocalTime(String name) {
		for(String i :TimeZone.getAvailableIDs()){
			if(i.toLowerCase().contains(name.toLowerCase()))
				return LocalTime.now(TimeZone.getTimeZone (i).toZoneId()).withNano(0);
		}
		return null;
	}
	@Override
	public String toString() {

		return String.format("%-11s%-11s", name,getLocalTime(name).toString());
	}
}
