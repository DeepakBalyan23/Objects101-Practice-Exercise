package com.stackroute.exercise2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class ChessBoardPrinterTest 
{
	
	private static ChessBoardPrinter chessBoardPrinter;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		chessBoardPrinter = new ChessBoardPrinter();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		chessBoardPrinter = null;

	}
	
	@Test
	public void testRemoveVowels() {
		chessBoardPrinter.printChessBoard();
	}
	
}
