package com.stackroute.p3.practiceExercise4;

public class OccurencesOfCharacter {

	public int getOccurencesOfCharacter(String inputString, char c) {
		int numberOfOccurences = inputString.split(Character.toString(c)).length-1;
		if(inputString.charAt(inputString.length()-1)==c)
			numberOfOccurences++;
		return numberOfOccurences;
	}
}
