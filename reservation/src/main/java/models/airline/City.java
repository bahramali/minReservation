package models.airline;

import java.time.LocalTime;
import java.util.*;
import java.util.Scanner;
import java.util.TimeZone;

public class City {
	private LocalTime localTime;
	private String name;
	
	public City(String name){
		setName(name);
		this.localTime = findLocalTime(this.name);
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public LocalTime findLocalTime(String name) {		
		for(String i :TimeZone.getAvailableIDs()){
			if(i.toLowerCase().contains(name.toLowerCase()))
				return LocalTime.now(TimeZone.getTimeZone (i).toZoneId()).withNano(0);
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(findLocalTime(name)!=null) {
			this.name = name;
		}else {
			System.out.println("There is no "+name+". Write the correct.");
			setName(new Scanner(System.in).nextLine());
		}
	}
	@Override
	public String toString() {

		return String.format("%-8s", name);
	}
}
