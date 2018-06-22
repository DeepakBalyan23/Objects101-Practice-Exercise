package com.stackroute.exercise2;

public class StudentsGradesValidator 
{
    private int numberOfStudents;
  
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public boolean gradesValidate(int []grades) {
		if(numberOfStudents != grades.length) {
			throw new Error("Input Mismatch");
		} else {
			for(int grade: grades) {
				if(grade<0||grade>100) {
					throw new Error("Invalid Grade");
				}
			}
		}
		return true;
	}
	
}
