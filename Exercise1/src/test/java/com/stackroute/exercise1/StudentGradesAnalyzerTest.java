package com.stackroute.exercise1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for StudentGradesAnalyzer.
 */

public class StudentGradesAnalyzerTest 
{
	
	private static StudentGradesAnalyzer studentGradesAnalyzer;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		studentGradesAnalyzer = new StudentGradesAnalyzer();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		studentGradesAnalyzer = null;

	}
	
	@Test
	public void testAverage() {
		assertEquals("Return average of all grades", "45", studentGradesAnalyzer.average("5", new int[] {50,40, 35, 55, 45}));
	}
	
	@Test
	public void testMinimum() {
		assertEquals("Return minimum of all grades", "35", studentGradesAnalyzer.minimum("5", new int[] {50,40, 35, 55, 45}));
	}
	
	@Test
	public void testMaximum() {
		assertEquals("Return maximum of all grades", "55", studentGradesAnalyzer.maximum("5", new int[] {50,40, 35, 55, 45}));
	}
	
	@Test
	public void testAverageInvalidInput() {
		assertEquals("Return average of all grades", "Invalid Input", studentGradesAnalyzer.average("6", new int[] {50,40, 35, 55, 45}));
	}
	
	@Test
	public void testMinimumInvalidInput() {
		assertEquals("Return minimum of all grades", "Invalid Input", studentGradesAnalyzer.minimum("-2", new int[] {50,40, 35, 55, 45}));
	}
	
	@Test
	public void testMaximumInvalidInput() {
		assertEquals("Return maximum of all grades", "Invalid Input", studentGradesAnalyzer.maximum("100", new int[] {50,40, 35, 55, 45}));
	}

	@Test(expected=NumberFormatException.class)
	public void testMinimumException() {
		studentGradesAnalyzer.minimum("3e", new int[] {5,6,3,656,23});
	}
	
	@Test(expected=NumberFormatException.class)
	public void testMaximumException() {
		studentGradesAnalyzer.maximum("3e", new int[] {5,6,3,656,23});
	}
	
	
	@Test(expected=NumberFormatException.class)
	public void testAverageException() {
		studentGradesAnalyzer.average("3e", new int[] {5,6,3,656,23});
	}
    
}
