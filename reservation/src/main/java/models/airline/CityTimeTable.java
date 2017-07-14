package models.airline;


import models.DayOfWeekAndTime;

public class CityTimeTable
{

	private City  city1;
	private City  city2;
	private DayOfWeekAndTime departured_Datetime;
	private DayOfWeekAndTime arrival_Datetime;
	
	public CityTimeTable(City city1, City city2,DayOfWeekAndTime arrival_Datetime,DayOfWeekAndTime departured_Datetime) {
		this.city1 = city1;
		this.city2 = city2;
		this.arrival_Datetime = arrival_Datetime;
		this.departured_Datetime = departured_Datetime;
	}

	public City getCity1()
	{
		return city1;
	}

	public void setCity1(City city1)
	{
		this.city1 = city1;
	}

	public City getCity2()
	{
		return city2;
	}

	public void setCity2(City city2)
	{
		this.city2 = city2;
	}

	public DayOfWeekAndTime getDepartured_Datetime()
	{
		return departured_Datetime;
	}

	public void setDepartured_Datetime(DayOfWeekAndTime departured_Datetime)
	{
		this.departured_Datetime = departured_Datetime;
	}

	public DayOfWeekAndTime getArrival_Datetime()
	{
		return arrival_Datetime;
	}

	public void setArrival_Datetime(DayOfWeekAndTime arrival_Datetime)
	{
		this.arrival_Datetime = arrival_Datetime;
	}
	
	@Override
	public String toString()
	{

		return String.format("%-7s%-7s%-18s%-18s",city1,city2,departured_Datetime,arrival_Datetime );
	}
	
}
