package com.stackroute.exercise2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class ExceptionTypeCheckerTest 
{
	
	private static ExceptionTypesChecker exceptionTypesChecker;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		exceptionTypesChecker = new ExceptionTypesChecker();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		exceptionTypesChecker = null;

	}
	
	@Test
	public void testNegativeArraySizeException() {
	    assertEquals("java.lang.NegativeArraySizeException",exceptionTypesChecker.negativeArraySizeException());
	}

	@Test
	public void testIndexOutOfBoundsException() {
		assertEquals("java.lang.ArrayIndexOutOfBoundsException",exceptionTypesChecker.indexOutOfBoundsException());   
	}

	@Test
	public void testNullPointerException() {
	    assertEquals("java.lang.NullPointerException",exceptionTypesChecker.nullPointerException());   
	}
}
