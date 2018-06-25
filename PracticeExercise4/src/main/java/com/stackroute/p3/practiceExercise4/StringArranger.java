package com.stackroute.p3.practiceExercise4;

import java.util.Arrays;

public class StringArranger {

	private String text;

	public void setText(String text) {
		this.text = text;
	}
	
	public String getalphabeticalOrder() {
		String [] textArray = text.split(" ");
		Arrays.sort(textArray, String.CASE_INSENSITIVE_ORDER);
		return Arrays.toString(textArray).replaceAll(",", "").replace("]", "").replace("[", "");
	}
}
