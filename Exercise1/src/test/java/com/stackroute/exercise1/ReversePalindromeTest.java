package com.stackroute.exercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple ReversePalindrome.
 */
public class ReversePalindromeTest 
{
	
	private static ReversePalindrome reversePalindrome;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		reversePalindrome = new ReversePalindrome();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		reversePalindrome = null;

	}

	@Test
	public void testIsPalindromeNormal() {

		assertTrue(
				"Check if string is a palindrome for general case", reversePalindrome.isPalindrome("abba"));

	}
	
	@Test
	public void testIsNotPalindrome() {

		assertFalse(
				"Check if string is a palindrome in case value of string is null", reversePalindrome.isPalindrome("abb"));

	}
	
	@Test
	public void testIsPalindromeOneChar() {

		assertTrue(
				"Check if string is a palindrome  in case there is only one char", reversePalindrome.isPalindrome("a"));

	}
	
	@Test
	public void testIsPalindromeNull() {

		assertNull(
				"Check if string is a palindrome in case value of string is null", reversePalindrome.isPalindrome(null));

	}
	
	@Test
	public void testReverseStringNormal() {

		assertEquals(
				"Return reverse string for general case", "cabba", reversePalindrome.reverseString("abbac"));

	}
	
	@Test
	public void testReverseStringOneChar() {

		assertEquals(
				"Return reverse string for one case", "a", reversePalindrome.reverseString("a"));

	}
	
	@Test
	public void testReverseStringNull() {

		assertNull(
				"Return null for null string", reversePalindrome.reverseString(null));

	}
    
}
