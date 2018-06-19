package com.stackroute.exercise1;

/*ReversePalindrome class has two functions
 * to reverse a string and
 * to check if the string is a palindrome or not*/

public class ReversePalindromeChecker 
{
	/*isPalindrome() return false if the inputString is a palindrome
	 * it returns false if the given string is not a palindrome*/
	
    public boolean isPalindrome(String inputString) {
    	String reversedString = reverseString(inputString);
    	if(inputString.isEmpty() || !inputString.equals(reversedString))
    		return false;
    	else
    		return true;
    }
    
    /*reverseString() returns the reverse of the inputString*/
    
    public String reverseString(String inputString) {
    	if(inputString.isEmpty())
    		return null;
    	else {
    		StringBuilder stringBuilderVariable = new StringBuilder(inputString);
        	return stringBuilderVariable.reverse().toString();
    	}
    }
}
