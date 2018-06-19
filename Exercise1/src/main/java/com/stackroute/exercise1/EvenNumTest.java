package com.stackroute.exercise1;

/*EvenNumTest Class is to test if the number is even or odd*/

public class EvenNumTest {

	/*isEven() function return true if it is even and return false if it is not even*/
	
	public boolean isEven(String inputString) {
		int num = Integer.parseInt(inputString);
		if(num%2==0)
			return true;
		else
			return false;
		
	}
}
