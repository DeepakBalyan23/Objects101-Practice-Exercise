package com.stackroute.p5.practiceExercise5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SetSorterTest 
{
	
	private static SetSorter setSorter;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		setSorter = new SetSorter();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		setSorter = null;

	}
	
	@Test
	public void testSortSet() {
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Alice", "Bluto", "Eugene", "Harry", "Olive"));
		assertEquals(expectedList, setSorter.sortSet(new String[] {"Harry", "Olive", "Alice", "Bluto", "Eugene"}));
	}
}
