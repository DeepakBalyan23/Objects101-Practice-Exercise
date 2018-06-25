package com.stackroute.p3.practiceExercise4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringArrangerTest 
{
	
	private static StringArranger stringArranger;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		stringArranger = new StringArranger();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		stringArranger = null;

	}
	
	@Test
	public void testLongestSubstringChecker() {
		stringArranger.setText("neque porro quisquam est qui dolorem ipsum quia dolor sit amet consectetur adipisci velit");
		assertEquals("adipisci amet consectetur dolor dolorem est ipsum neque porro qui quia quisquam sit velit",stringArranger.getalphabeticalOrder());
		
	}
}
