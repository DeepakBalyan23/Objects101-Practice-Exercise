package com.stackroute.p5.practiceExercise5;

import java.util.HashMap;

public class WordCounter {

	public HashMap<String, Integer> countWords(String inputString) {
		String[] stringArray = inputString.split("\\W|_");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String str: stringArray) {
			if(!str.isEmpty()) {
				if(map.containsKey(str)) {
					map.put(str, map.get(str)+1);
				} else {
					map.put(str,1);
				}
			}
		}
		return map;
	}
}
