package com.stackroute.exercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple ReversePalindrome.
 */
public class ReversePalindromeTest 
{
	
	private static ReversePalindrome reversePalindrome;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		reversePalindrome = new ReversePalindrome();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		reversePalindrome = null;

	}

	@Test
	public void testGetFileName() {

		//assertEquals(
		//		"File name extraction failed. File name can be found after a space after from clause. Note: CSV file can contain a field that contains from as a part of the column name. For eg: from_date,from_hrs etc",
		//		"ipl.csv", reversePalindrome.getFileName("select city,winner,team1,team2 from ipl.csv"));

	}
    
}
