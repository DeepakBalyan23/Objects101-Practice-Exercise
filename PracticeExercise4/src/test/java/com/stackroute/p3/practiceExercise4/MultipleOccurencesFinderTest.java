package com.stackroute.p3.practiceExercise4;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultipleOccurencesFinderTest 
{
	
	private static MultipleOccurencesFinder multipleOccurencesFinder;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		multipleOccurencesFinder = new MultipleOccurencesFinder();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		multipleOccurencesFinder = null;

	}
	
	@Test
	public void testGetIndicesOfSubstring() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("4-6");
		expected.add("10-12");
		expected.add("27-29");
		assertEquals(expected,multipleOccurencesFinder.getIndicesOfSubstring("She sells seashells by the seashore", "se"));
	}
}
