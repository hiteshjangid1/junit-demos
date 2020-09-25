package com.mahendra;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WeekSelectorTest {
	
	private int weekNumberInput;
	private String expectedResult;
	
	private WeekSelector selector = null;
	
	public WeekSelectorTest(int weekNumberInput, String expectedResult) {
		super();
		this.weekNumberInput = weekNumberInput;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection weekData() {
		return Arrays.asList(new Object[][] {
			{1,"SUNDAY"},
			{2,"MONDAY"},
			{3,"TUESDAY"},
			{4,"WEDNESDAY"},
			{5,"THURSDAY"},
			{6,"FRIDAY"},
			{7,"SATURDAY"}});
	}

	@Before
	public void init()throws Exception{
		selector = new WeekSelector();
	}
	

	@Test
	public void testGetWeekDay() {
		String actualWeek = selector.getWeekDay(weekNumberInput);
		assertEquals(expectedResult,actualWeek);
	}

}
