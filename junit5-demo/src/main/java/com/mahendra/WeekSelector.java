package com.mahendra;

public class WeekSelector {

	public String getWeekDay(int wk) {
		switch(wk) {
		case 1:
			return "SUNDAY";
		case 2:
			return "MONDAY";
		case 6:
			return "FRIDAY";
		default:
				return "SATURDAY";		
		}		
	}
}
