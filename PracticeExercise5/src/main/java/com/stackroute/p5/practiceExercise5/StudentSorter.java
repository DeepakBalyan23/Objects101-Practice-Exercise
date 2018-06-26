package com.stackroute.p5.practiceExercise5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		if(s1.getAge()!=s2.getAge())
			return s2.getAge()-s1.getAge();
		else {
			if(!s1.getName().equals(s2.getName())){
				return s1.getName().compareTo(s2.getName());
			} else {
				return s1.getId()-s2.getId();
			}
		}
	}
}
