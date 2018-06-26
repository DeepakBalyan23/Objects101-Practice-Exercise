package com.stackroute.p5.practiceExercise5;

import java.util.ArrayList;

public class ArrayUpdater 
{
    public ArrayList<String> updateArray(ArrayList<String> stringArray, String oldString, String newString) {
    	stringArray.set(stringArray.indexOf(oldString), newString);
    	return stringArray;
    }
    
    public ArrayList<String> clearArray(ArrayList<String> stringArray) {
    	stringArray.clear();
    	return stringArray;
    }
}
