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

		assertEquals(
				"Return number is the power of 4", "Number is the power of 4", powerOfFour.isPowerOfFour("64"));

	}
	
	@Test
	public void testIsNotPowerOfFour() {

		assertEquals(
				"Return number is not the power of 4", "Number is not the power of 4", powerOfFour.isPowerOfFour("128"));

	}
	
	@Test
	public void testIsPowerOfFourInvalidInput() {

		assertEquals(
				"Return invalid input", "Invalid Input", powerOfFour.isPowerOfFour("128a"));

	}
	
	@Test
	public void testIsPowerOfFourNullInput() {

		assertEquals(
				"Return invalid input", "Invalid Input", powerOfFour.isPowerOfFour(null));

	}
    
}
