package com.stackroute.exercise1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple ReversePalindrome.
 */
public class PowerOfFourCheckerTest 
{
	
	private static PowerOfFourChecker powerOfFour;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		powerOfFour = new PowerOfFourChecker();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		powerOfFour = null;

	}

	@Test
	public void testIsPowerOfFour() {

		try {
			assertTrue("Return true if number is a power of 4", powerOfFour.isPowerOfFour("64"));
		} catch (Exception e) {
			assertEquals("java.lang.NumberFormatException", e.toString().split(":")[0]);
		}

	}
	
	@Test
	public void testIsNotPowerOfFour() {

		try {
			assertFalse("Return false if number is not a power of 4", powerOfFour.isPowerOfFour("128"));
		} catch (Exception e) {
			assertEquals("java.lang.NumberFormatException", e.toString().split(":")[0]);
		}

	}
	
	@Test
	public void testIsPowerOfFourInvalidInput() {

		try {
			assertEquals(
					"Return invalid input", "Invalid Input", powerOfFour.isPowerOfFour("128a"));
		} catch (Exception e) {
			assertEquals("java.lang.NumberFormatException", e.toString().split(":")[0]);		}

	}
	
	@Test
	public void testIsPowerOfFourNullInput() {

		try {
			assertEquals(
					"Return invalid input", "Invalid Input", powerOfFour.isPowerOfFour(null));
		} catch (Exception e) {
			assertEquals("java.lang.NumberFormatException", e.toString().split(":")[0]);
		}

	}
    
}
