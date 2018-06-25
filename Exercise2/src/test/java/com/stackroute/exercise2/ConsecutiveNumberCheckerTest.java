package com.stackroute.exercise2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class ConsecutiveNumberCheckerTest 
{
	
	private static ConsecutiveNumberChecker consecutiveNumberChecker;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		consecutiveNumberChecker = new ConsecutiveNumberChecker();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		consecutiveNumberChecker = null;

	}
	
	@Test
	public void isConsecutiveTrue() {
		assertTrue(consecutiveNumberChecker.isConsecutive("5,6,7,8,9"));
		assertTrue(consecutiveNumberChecker.isConsecutive("12,11,10,9,8"));
	}
	
	@Test
	public void isConsecutiveFalses() {
		assertFalse(consecutiveNumberChecker.isConsecutive("5,6,7,10,9"));
		assertFalse(consecutiveNumberChecker.isConsecutive("12,13,10,9,8"));
	}
	
	@Test(expected=java.lang.Error.class)
	public void isConsecutiveError() {
		consecutiveNumberChecker.isConsecutive("5");
	}
	
	@Test(expected=java.lang.NumberFormatException.class)
	public void isConsecutiveException() {
		consecutiveNumberChecker.isConsecutive("5, a, 6");
	}
}
