package com.stackroute.exercise1;

public class ReversePalindrome 
{
    public boolean isPalindrome(String str) {
    	String reversedString = reverseString(str);
    	if(str==null || str.equals(null) || str.equals("") || !str.equals(reversedString))
    		return false;
    	else
    		return true;
    }
    
    public String reverseString(String str) {
    	if(str==null || str.equals(null) || str.equals(""))
    		return null;
    	else {
    		StringBuilder s = new StringBuilder(str);
        	return s.reverse().toString();
    	}
    }
}
