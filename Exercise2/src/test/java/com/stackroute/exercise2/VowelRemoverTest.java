package com.stackroute.exercise2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class VowelRemoverTest 
{
	
	private static VowelRemover vowelRemover;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		vowelRemover = new VowelRemover();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		vowelRemover = null;

	}
	
	@Test
	public void testRemoveVowels() {
		assertEquals(new String[] {"nd", "strl", "nglnd", "Pkstn"}, vowelRemover.removeVowels(new String[] {"India", "Australia", "England", "Pakistan"}));
	}
	
}
