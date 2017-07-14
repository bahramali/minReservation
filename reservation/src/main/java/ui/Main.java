package ui;

import java.time.*;
import java.util.*;

import models.airline.*;

public class Main {

	public static void main(String[] args){

		
		//-----------------------------Test AirLine--------------------------
		
		AirLine macAir = new AirLine("MAC AIR");
		AirLine macAir2 = new AirLine("MAC AIR",new ArrayList<AirCraft>());
		AirLine macAir3 = new AirLine("MAC AIR",new AirCraft(16, 40, 2500, 2500, "Boeing 330", "IR703"));
		
		//-----------------------------Test AirCraft--------------------------
		
		AirCraft a = new AirCraft(10, 20, 2000, 500, "Airbus 330", "IR713");
		AirCraft b = new AirCraft(16, 40, 2400, 1500, "Airbus 360", "IR775");
			// change price for special seat
			a.getSeats().get(10).setPrice(3000);
		
		//---------Add AirCraft To AirLine---
					macAir.addAirCraft(a);
					macAir.addAirCraft(b);
					
		System.out.println("-----------AirCarfts----------");
		macAir.getAirCrafts().forEach(System.out::println);	
		
		//-----------------------------Test City and add city to AirLine------------------------------
		
		City os = new City("Oslo");
		System.out.println("-----------Cities----------");
		macAir.getAllCities().forEach(System.out::println);
		System.out.println();
		
		macAir.addCitiy("tehran");
		macAir.addCitiy(os);
		
		System.out.println("-----------New Cities----------");
		macAir.getAllCities().forEach(System.out::println);
		
		//--------------------------------Test Ticket ----------------------
		
		Timeing_Price t = new Timeing_Price(2000d, LocalDateTime.of(LocalDate.of(2017, 10, 12), LocalTime.of(12, 30)), new Hours(2,30));
		System.out.println(t.getDuration());
		
		//---------------------------------Test ----------------------------------------
		
	}
}