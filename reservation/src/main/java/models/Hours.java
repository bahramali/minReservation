package models;

import java.time.LocalTime;

public class Hours {
	private int hour;
	private int minuts;
	LocalTime localHour; 
	
	public Hours(int hour) {
		this.hour = hour;
		setMinuts(0);
	}
	public Hours(int hour, int minuts) {

		this.hour = hour;
		setMinuts(minuts);
	}


	public int getHour() {
		return hour;
	}


	public int getMinuts() {
		return minuts;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}

	public LocalTime toLocalTime() {
		
		return LocalTime.of(hour, minuts);
	}
	public void setMinuts(int minuts) {
		if((0<=minuts) && (minuts<60))
				this.minuts = minuts;
		else
			System.out.println("minuts is wrong!");
	}
	
	@Override
	public String toString() {
		
		return String.format("%2d:%2d", hour,minuts);
	}
	
	
}
