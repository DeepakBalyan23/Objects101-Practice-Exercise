package com.stackroute.p3.practiceExercise4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OccurencesOfCharacterTest 
{
	
	private static OccurencesOfCharacter occurencesOfCharacter;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		occurencesOfCharacter = new OccurencesOfCharacter();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		occurencesOfCharacter = null;

	}
	
	@Test
	public void testGetOccurencesOfCharacter() {
		assertEquals(13,occurencesOfCharacter.getOccurencesOfCharacter("abbccabababaaaabababacbabccbcbcba", 'b'));
	}
}
