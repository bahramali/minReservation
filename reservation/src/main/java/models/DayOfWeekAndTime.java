package models;

import java.time.DayOfWeek;
import java.time.LocalTime;


public class DayOfWeekAndTime{
	private DayOfWeek dayOfWeek;
	private LocalTime localTime;
	
	public DayOfWeekAndTime(DayOfWeek dayOfWeek,LocalTime localTime) {
		this.dayOfWeek = dayOfWeek;
		this.localTime = localTime;
	}

	public DayOfWeek getDayOfWeek()
	{
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}

	public LocalTime getLocalTime()
	{
		return localTime;
	}

	public void setLocalTime(LocalTime localTime)
	{
		this.localTime = localTime;
	}
	@Override
	public String toString()
	{
		return String.format("%-8s%-8s", dayOfWeek.toString(),localTime.toString());
	}
}