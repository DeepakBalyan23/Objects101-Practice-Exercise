package com.stackroute.p5.practiceExercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetSorter {

	public ArrayList<String> sortSet(String[] names) {
		Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		set.addAll(Arrays.asList(names));
		ArrayList<String> list = new ArrayList<String>(set);
		return list;
	}
}
