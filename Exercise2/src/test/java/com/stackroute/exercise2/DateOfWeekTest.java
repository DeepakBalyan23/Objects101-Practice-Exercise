package com.stackroute.exercise2;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class DateOfWeekTest 
{
	
	private static DateOfWeek dateOfWeek;
	private static DateFormat dateFormat; 

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		dateOfWeek = new DateOfWeek();
		dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		dateOfWeek = null;

	}
	
	@Test
	public void testFirstDateOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, 5);
		calendar.set(Calendar.DATE, 25);
		String dateString = dateFormat.format(calendar.getTime());
		assertEquals(dateString, dateOfWeek.getFirstDateOfWeek(Calendar.getInstance()));
	}
	
	@Test
	public void testLastDateOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, 6);
		calendar.set(Calendar.DATE, 1);
		String dateString = dateFormat.format(calendar.getTime());
		assertEquals(dateString, dateOfWeek.getLastDateOfWeek(Calendar.getInstance()));
	}
	
}
