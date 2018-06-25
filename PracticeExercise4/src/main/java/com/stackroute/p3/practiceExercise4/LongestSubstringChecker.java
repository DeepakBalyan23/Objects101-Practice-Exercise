package com.stackroute.p3.practiceExercise4;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstringChecker 
{
    public String getStringWithTwoUniqueChar(String inputString) {
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	ArrayList<String> strings = new ArrayList<String>();
    	for(int j=0;j<inputString.length();j++) {
    		map.clear();
    		String str="";
	    	for(int i=j;i<inputString.length();i++) {
	    		char c = inputString.charAt(i);
	    		if(map.containsKey(c)) {
	    			map.put(c, map.get(c)+1);
	    		} else {
	    			map.put(c, 1);
	    		}
	    		if(map.size()>2) {
	    			break;
	    		} else {
	    			str += Character.toString(c);
	    		}
	    	}
	    	strings.add(str);
    	}
    	return getLargestString(strings);
    }
    
    private String getLargestString(ArrayList<String> strings) {
    	String largestString = "";
    	for(String str: strings) {
    		if(str.length()>largestString.length())
    			largestString = str;
    	}
    	return largestString;
    }
}
