package com.stackroute.p3.practiceExercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurencesFinder {

	public List<String> getIndicesOfSubstring(String inputString, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher  matcher = pattern.matcher(inputString);
        ArrayList<String> indeces = new ArrayList<String>();
        while(matcher.find()) {
        	indeces.add(matcher.start()+"-"+(matcher.start()+word.length()));
        }
        return indeces;
	}
}
