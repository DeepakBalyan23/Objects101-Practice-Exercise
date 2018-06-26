package com.stackroute.p5.practiceExercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetSorter {

	public ArrayList<String> sortSet(String[] names) {
		SortedSet<String> set = new TreeSet<String>(Arrays.asList(names));
		ArrayList<String> list = new ArrayList<String>(set);
		return list;
	}
}
