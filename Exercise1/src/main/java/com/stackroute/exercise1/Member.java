package com.stackroute.exercise1;

import java.math.BigDecimal;

/*Member class has three member variables name, age and salary.
 * It has two constructors with different number of parameters
 * It also has getter and setter function for all the member variables*/

public class Member {

	private String name;
	private int age;
	private BigDecimal salary;
	
	/*Constructor with three parameters*/
	
	Member(String name, int age, BigDecimal salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	/*Default Constructor*/
	
	Member(){
		this.name = "Deepak";
		this.age = 23;
		this.salary = new BigDecimal(1000);
	}
	
	/*Getters and Setters*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
}
