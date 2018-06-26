package com.stackroute.p5.practiceExercise5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayUpdaterTest 
{
	
	private static ArrayUpdater arrayUpdater;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		arrayUpdater = new ArrayUpdater();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		arrayUpdater = null;

	}
	
	@Test
	public void testUpdateArray() {
		ArrayList<String> expectedArray = new ArrayList<String>(Arrays.asList("Apple", "Grape", "Mango", "Berry"));
		ArrayList<String> inputArray = new ArrayList<String>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
		assertEquals(expectedArray, arrayUpdater.updateArray(inputArray, "Melon", "Mango"));
	}
	
	@Test
	public void testClearArray() {
		ArrayList<String> expectedArray = new ArrayList<String>();
		ArrayList<String> inputArray = new ArrayList<String>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
		assertEquals(expectedArray, arrayUpdater.clearArray(inputArray));
	}
}
