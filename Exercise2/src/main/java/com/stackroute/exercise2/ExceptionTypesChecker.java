package com.stackroute.exercise2;

public class ExceptionTypesChecker {

	public String negativeArraySizeException() {
		try {
			int array[] = new int[-1];
		} catch(Exception e) {
			return e.getClass().getName();
		}
		return null;
	}
	
	public String indexOutOfBoundsException() {
		int array[] = new int[] {4,5,10};
		try {
			System.out.println("x "+array[3]);
		} catch(Exception e) {
			return e.getClass().getName();
		}
		return null;
	}
	
	public String nullPointerException() {
		int array[] = null;
		try {
			System.out.println("x2"+array[3]);
		} catch(Exception e) {
			return e.getClass().getName();
		}
		return null;
	}
}
