package com.stackroute.exercise1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class EvenNumTestTest 
{
	
	private static EvenNumTest evenNumTest;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		evenNumTest = new EvenNumTest();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		evenNumTest = null;

	}
	
	@Test
	public void testIsEven() {
		assertTrue(evenNumTest.isEven("20"));
	}
	
	@Test
	public void testIsNotEven() {
		assertFalse(evenNumTest.isEven("21"));
	}
    
	@Test(expected=NumberFormatException.class)
	public void testThrowsExceptionIfNotNumber() {
		evenNumTest.isEven("abc");
	}
}
