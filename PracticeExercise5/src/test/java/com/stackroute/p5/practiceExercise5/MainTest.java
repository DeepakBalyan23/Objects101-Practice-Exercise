package com.stackroute.p5.practiceExercise5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest 
{
	
	private static StudentSorter studentSorter;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		studentSorter = new StudentSorter();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		studentSorter = null;

	}
	
	@Test
	public void testCompareFunction() {
		Student s1 = new Student(5, "John", 25);
		Student s2 = new Student(2, "Tom", 20);
		Student s3 = new Student(1, "John", 25);
		Student s4 = new Student(4, "Jerry", 35);
		Student s5 = new Student(3, "Robbert", 25);
		ArrayList<Student> studentsArray = new ArrayList<Student>();
		studentsArray.add(s1);
		studentsArray.add(s2);
		studentsArray.add(s3);
		studentsArray.add(s4);
		studentsArray.add(s5);
		ArrayList<Student> sortedStudentsArray = new ArrayList<Student>();
		sortedStudentsArray.add(s4);
		sortedStudentsArray.add(s3);
		sortedStudentsArray.add(s1);
		sortedStudentsArray.add(s5);
		sortedStudentsArray.add(s2);
		
		studentsArray.sort(studentSorter);
		assertEquals(sortedStudentsArray, studentsArray);
	}
}
