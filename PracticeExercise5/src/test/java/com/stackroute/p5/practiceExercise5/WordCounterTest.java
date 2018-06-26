package com.stackroute.p5.practiceExercise5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordCounterTest 
{
	
	private static WordCounter wordCounter;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		wordCounter = new WordCounter();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		wordCounter = null;

	}
	
	@Test
	public void testUpdateArray() {
		HashMap<String, Integer> expectedMap = new HashMap<String, Integer>();
		expectedMap.put("one", 5);
		expectedMap.put("two", 2);
		expectedMap.put("three", 2);
		assertEquals(expectedMap, wordCounter.countWords("one one -one___two,,three,one @three*one?two"));
	}
}
