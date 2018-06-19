package com.stackroute.exercise1;

public class PowerOfFour {

	public String isPowerOfFour(String str) {
		if(str==null || !str.matches("[0-9]+"))
			return "Invalid Input";
		else {
			int num = Integer.parseInt(str);
			while(num!=1) {
				if(num%4 != 0) {
					return "Number is not the power of 4";
				}
				num = num/4;
			}
			return "Number is the power of 4";
		}
	}
	
}
