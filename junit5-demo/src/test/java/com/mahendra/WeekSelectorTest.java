package com.mahendra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class WeekSelectorTest {
	
	private WeekSelector selector = new WeekSelector();
	
	
	@ParameterizedTest
	//@CsvSource(delimiter=',',value= {"1, SUNDAY","2, MONDAY"})
	@CsvFileSource(resources="/data.csv")
	void testGetWeekDay(int day, String weekDay) {
		String actualWeek = selector.getWeekDay(day);
		assertEquals(weekDay,actualWeek);
	}

}
