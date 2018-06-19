package com.stackroute.exercise1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple ReversePalindrome.
 */
public class MemberTest 
{
	
	private static MemberVariable memberVariable;
	private static Member member;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		memberVariable = new MemberVariable();
		member = new Member("Harry Porter", 30, 2500.3);

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		memberVariable = null;

	}
	
	@Test
	public void testGetName() {
		
		assertEquals(
				"Return invalid input", member.name, memberVariable.getName(member));

	}
	
	@Test
	public void testGetAge() {
		
		assertEquals(
				"Return invalid input", member.age, memberVariable.getAge(member));

	}
	
	@Test
	public void testGetSalary() {
		
		assertEquals(
				"Return invalid input", member.salary+"", memberVariable.getSalary(member));

	}
    
}
