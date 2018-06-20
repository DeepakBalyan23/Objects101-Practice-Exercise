package com.stackroute.exercise1;

public class StudentGradesAnalyzer {
	
	public String sum(String numOfStudentsString, int grades[]) {
		int numOfStudents = Integer.parseInt(numOfStudentsString);
		if(numOfStudents >=0 && numOfStudents <=100 && numOfStudents == grades.length) {
			int sum = 0;
			for(int grade: grades) {
				sum+=grade;
			}
			return sum+"";
		} else {
			return "Invalid Input";
		}
	}

	public String average(String numOfStudentsString, int grades[]) {
		int numOfStudents = Integer.parseInt(numOfStudentsString);
		if(sum(numOfStudentsString, grades) == "Invalid Input")
			return "Invalid Input";
		else {
			int sum = Integer.parseInt(sum(numOfStudentsString, grades));
			return (sum/numOfStudents) + "";
		}
	}
	
	public String minimum(String numOfStudentsString, int grades[]) {
		int numOfStudents = Integer.parseInt(numOfStudentsString);
		if(numOfStudents >=0 && numOfStudents <=100 && numOfStudents == grades.length) {
			int min = Integer.MAX_VALUE;
			for(int grade: grades) {
				if(grade<min)
					min = grade;
			}
			return min+"";
		} else {
			return "Invalid Input";
		}
	}
	
	public String maximum(String numOfStudentsString, int grades[]) {
		int numOfStudents = Integer.parseInt(numOfStudentsString);
		if(numOfStudents >=0 && numOfStudents <=100 && numOfStudents == grades.length) {
			int max = Integer.MIN_VALUE;
			for(int grade: grades) {
				if(grade>max)
					max = grade;
			}
			return max+"";
		} else {
			return "Invalid Input";
		}
	}
	
}
