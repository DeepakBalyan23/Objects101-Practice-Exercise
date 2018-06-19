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
		try {
			assertTrue("Is a even number", evenNumTest.isEven("20"));
		} catch (Exception e) {
			assertEquals("java.lang.NullPointerException", e.toString().split(":")[0]);
		}

	}
	
	@Test
	public void testIsEvenWithNumberFormatException() {
		try {
			assertTrue("Is a even number", evenNumTest.isEven("20a"));
		} catch (Exception e) {
			assertEquals("java.lang.NumberFormatException", e.toString().split(":")[0]);
		}

	}
    
	@Test(expected=NumberFormatException.class)
	public void testThrowsExceptionIfNotNumber() {
		
			assertTrue("Is not an even number", evenNumTest.isEven("abc"));
	

	}
}
