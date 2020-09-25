package com.mahendra;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WeekSelectorTest {
	
	private int weekNumberInput;
	private String expectedResult;
	
	
	public static List<Object[]> loadFromFile()throws Exception {
		BufferedReader br=null;
		List<Object[]> data = new LinkedList<Object[]>();
		try {
			//
		InputStream in = WeekSelectorTest.class.getResourceAsStream("/data.csv");
		
		br = new BufferedReader(new InputStreamReader(in));
		String line = br.readLine();
		while(line!=null) {
			///USE SEPERATOR for SPLITTING
			String[] temp = line.split(",");
			//USE .trim() to remove unwanted SPACES before and after string value
			data.add(new Object[]{Integer.parseInt(temp[0]),temp[1].trim()});
			line = br.readLine();
		}
		}catch(IOException ex) {
			System.out.println("Unable to read the file!");
		}finally {
			try {
				if(br!=null)
					br.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		return data;
		
	}
	
	
	
	
	private WeekSelector selector = null;
	
	public WeekSelectorTest(int weekNumberInput, String expectedResult) {
		super();
		this.weekNumberInput = weekNumberInput;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection weekData() {
		try {
			return loadFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
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
