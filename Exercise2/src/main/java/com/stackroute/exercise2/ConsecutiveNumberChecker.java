package com.stackroute.exercise2;

public class ConsecutiveNumberChecker {

	public boolean isConsecutive(String numbersString) {
		if(numbersString.isEmpty()||numbersString.length()<=1) {
			throw new Error("Nothing to compare");
		} else {
			String[] numbers =  numbersString.split(",");
			int compareVar = Integer.parseInt(numbers[0]);
			boolean isAssending;
			if(Integer.parseInt(numbers[0]) > Integer.parseInt(numbers[1]))
				isAssending = false;
			else
				isAssending = true;
			for(String numberString:numbers) {
				int number = Integer.parseInt(numberString);
				if(compareVar!=number)
					return false;
				else {
					if(isAssending)
						compareVar++;
					else
						compareVar--;
				}
			}
			return true;
		}
	}
}
