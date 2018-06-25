package com.stackroute.p3.practiceExercise4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LongestSubstringCheckerTest 
{
	
	private static LongestSubstringChecker longestSubstringChecker;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		longestSubstringChecker = new LongestSubstringChecker();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		longestSubstringChecker = null;

	}
	
	@Test
	public void testLongestSubstringChecker() {
		assertEquals("abababaaaabababa",longestSubstringChecker.getStringWithTwoUniqueChar("aabbccabababaaaabababacbabccbcbcb"));
	}
}
