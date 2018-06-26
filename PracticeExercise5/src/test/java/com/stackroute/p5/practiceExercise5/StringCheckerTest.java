package com.stackroute.p5.practiceExercise5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringCheckerTest 
{
	
	private static StringChecker stringChecker;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		stringChecker = new StringChecker();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		stringChecker = null;

	}
	
	@Test
	public void testUpdateArray() {
		HashMap<String, Boolean> expectedMap = new HashMap<String, Boolean>();
		expectedMap.put("a", true);
		expectedMap.put("b", false);
		expectedMap.put("c", true);
		expectedMap.put("d", false);
		assertEquals(expectedMap, stringChecker.countWords(new String[] {"a","b","c","d","a","c","c"}));
	}
}
