package com.stackroute.exercise1;

/*PowerOfFourChecker checks if a given number is a power of 4 or not
 * It has one method isPowerOfFour()*/

public class PowerOfFourChecker {

	/*isPowerOfFour() function returns if the inputString is the power of four or not*/
	
	public String isPowerOfFour(String inputString) {
		if(inputString.isEmpty() || !inputString.matches("[0-9]+"))
			return "Invalid Input";
		else {
			int num = Integer.parseInt(inputString);
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
