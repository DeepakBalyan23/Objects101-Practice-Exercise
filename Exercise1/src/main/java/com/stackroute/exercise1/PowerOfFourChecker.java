package com.stackroute.exercise1;

/*PowerOfFourChecker checks if a given number is a power of 4 or not
 * It has one method isPowerOfFour()*/

public class PowerOfFourChecker {

	/*isPowerOfFour() function returns if the inputString is the power of four or not*/
	
	public boolean isPowerOfFour(String inputString) throws Exception{
		int num = Integer.parseInt(inputString);
		while(num!=1) {
			if(num%4 != 0) {
				return false;
			}
			num = num/4;
		}
		return true;
	}
	
}
