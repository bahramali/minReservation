package models.airline;


import models.WeekDays_Time;

public class CityTimeTable
{

	private City  city1;
	private City  city2;
	private WeekDays_Time departured_Datetime;
	
	public CityTimeTable(City city1, City city2,WeekDays_Time departured_Datetime) {
		this.city1 = city1;
		this.city2 = city2;
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

	public WeekDays_Time getDepartured_Datetime()
	{
		return departured_Datetime;
	}

	public void setDepartured_Datetime(WeekDays_Time departured_Datetime)
	{
		this.departured_Datetime = departured_Datetime;
	}

	
	
	@Override
	public String toString()
	{

		return String.format("%-7s%-7s%-18s",city1,city2,departured_Datetime );
	}
	
}
