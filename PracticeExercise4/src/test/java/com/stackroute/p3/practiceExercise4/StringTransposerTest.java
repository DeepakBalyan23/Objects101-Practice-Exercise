package com.stackroute.p3.practiceExercise4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringTransposerTest 
{
	
	private static StringTransposer stringTransposer;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		stringTransposer = new StringTransposer();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		stringTransposer = null;

	}
	
	@Test
	public void testLongestSubstringChecker() {
		assertEquals("a kciuq nworb xof spmuj revo eht yzal god",stringTransposer.transposeString("a quick brown fox jumps over the lazy dog"));
		
	}
}
