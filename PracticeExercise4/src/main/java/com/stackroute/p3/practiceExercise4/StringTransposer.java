package com.stackroute.p3.practiceExercise4;

import java.util.Arrays;

public class StringTransposer {

	public String transposeString(String inputString) {
		String[] strings = inputString.split(" ");
		String[] transposedStrings = new String[strings.length];
		for(int i=0;i<strings.length;i++) {
			StringBuilder sb = new StringBuilder(strings[i]);
			transposedStrings[i]=sb.reverse().toString();
		}
		return Arrays.toString(transposedStrings).replaceAll(",", "").replace("[", "").replace("]", "");
	}
}
