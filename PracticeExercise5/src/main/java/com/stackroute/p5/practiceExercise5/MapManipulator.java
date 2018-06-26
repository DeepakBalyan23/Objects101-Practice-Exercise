package com.stackroute.p5.practiceExercise5;

import java.util.HashMap;

public class MapManipulator {

	public HashMap<String, String> manipulateMap(HashMap<String, String> map){
		if(!map.get("val1").isEmpty()) {
			map.put("val2", map.get("val1"));
			map.put("val1", "");
		}
		return map;
	}
}
