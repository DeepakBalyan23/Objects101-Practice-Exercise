package com.stackroute.exercise1;

import static org.junit.Assert.*;

import java.math.BigDecimal;

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
		member = new Member("Harry Porter", 30, new BigDecimal(2500.3));

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		memberVariable = null;
		member = null;

	}
	
	@Test
	public void testGetName() {
		
		assertEquals(
				"Return member name", member.getName(), memberVariable.createMemberInstance("Harry Porter", 30, new BigDecimal(2500.3)).getName());

	}
	
	@Test
	public void testGetAge() {
		
		assertEquals(
				"Return member age", member.getAge(), memberVariable.createMemberInstance("Harry Porter", 30, new BigDecimal(2500.3)).getAge());

	}
	
	@Test
	public void testGetSalary() {
		
		assertEquals(
				"Return member salary", member.getSalary(), memberVariable.createMemberInstance("Harry Porter", 30, new BigDecimal(2500.3)).getSalary());

	}
    
}
