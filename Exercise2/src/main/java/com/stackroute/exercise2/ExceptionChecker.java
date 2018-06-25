package com.stackroute.exercise2;

public class ExceptionChecker {

	public static void main(String args[]) {
		try {
			throw new Exception("Exception Testing");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Success");
		}
	}
}
