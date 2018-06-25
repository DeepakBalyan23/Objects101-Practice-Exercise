package com.stackroute.exercise2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class MatrixAdditionCalculatorTest 
{
	
	private static MatrixAdditionCalculator matrixAdditionCalculator;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		matrixAdditionCalculator = new MatrixAdditionCalculator();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		matrixAdditionCalculator = null;

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGradeValidate() {
		matrixAdditionCalculator.setColumns(3);
		matrixAdditionCalculator.setRows(3);
		matrixAdditionCalculator.setMatrix1(new int[][] {{4,5,9},{2,10,5},{5,11,12}});
		matrixAdditionCalculator.setMatrix2(new int[][] {{2,5,4},{22,44,5},{15,10,11}});
		assertEquals(new int[][] {{6,10,13},{24,54,10},{20,21,23}}, matrixAdditionCalculator.matrixAddition());
	}
}
