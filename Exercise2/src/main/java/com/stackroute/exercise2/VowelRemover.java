package com.stackroute.exercise2;

public class VowelRemover {

	public String[] removeVowels(String[] places) {
		String[] placesWithoutVowels=new String[places.length];
		int index=0;
		for(String place:places) {
			placesWithoutVowels[index++] = place.replaceAll("a|e|i|o|u|A|I|E|O|U", "");
		}
		return placesWithoutVowels;
	}
}
