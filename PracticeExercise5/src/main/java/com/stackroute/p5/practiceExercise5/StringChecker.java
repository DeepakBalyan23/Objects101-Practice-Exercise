package com.stackroute.p5.practiceExercise5;

import java.util.HashMap;

public class StringChecker {

	public HashMap<String, Boolean> countWords(String[] stringArray) {
		HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
		for(String str: stringArray) {
			if(!str.isEmpty()) {
				if(frequencyMap.containsKey(str)) {
					frequencyMap.put(str, frequencyMap.get(str)+1);
				} else {
					frequencyMap.put(str,1);
				}
			}
		}
		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		for(String str: stringArray) {
			if(!map.containsKey(str) && frequencyMap.containsKey(str)) {
				if(frequencyMap.get(str)>=2)
					map.put(str, true);
				else
					map.put(str, false);
			}
		}
		return map;
	}
}
