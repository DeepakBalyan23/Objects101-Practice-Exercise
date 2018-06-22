package com.stackroute.exercise2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/* Unit test for EvenNumTest
 */
public class StudentMarksTester 
{
	
	private static StudentsGradesValidator studentsGradesValidator;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		studentsGradesValidator = new StudentsGradesValidator();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		studentsGradesValidator = null;

	}
	
	@Test
	public void testGradeValidate() {
		studentsGradesValidator.setNumberOfStudents(5);
		assertTrue(studentsGradesValidator.gradesValidate(new int[] {20, 80, 50, 40, 80}));
	}
	
	@Test(expected=java.lang.Error.class)
	public void testGradeValidateInputMismatch() {
		studentsGradesValidator.setNumberOfStudents(5);
		studentsGradesValidator.gradesValidate(new int[] {20, 80, 50, 40});
	}
	
	@Test(expected=java.lang.Error.class)
	public void testGradeValidateInvalidGrade() {
		studentsGradesValidator.setNumberOfStudents(5);
		studentsGradesValidator.gradesValidate(new int[] {20, 80, 50, 40, 102});
	}
}
