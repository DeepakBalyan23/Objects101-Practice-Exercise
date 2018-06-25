package com.stackroute.exercise2;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class DateOfWeekTest 
{
	
	private static DateOfWeek dateOfWeek;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		dateOfWeek = new DateOfWeek();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		dateOfWeek = null;

	}
	
	@Test
	public void testFirstDateOfWeek() {
		assertEquals("2018/06/25", dateOfWeek.getFirstDateOfWeek(Calendar.getInstance()));
	}
	
	@Test
	public void testLastDateOfWeek() {
		assertEquals("2018/07/01", dateOfWeek.getLastDateOfWeek(Calendar.getInstance()));
	}
	
}
