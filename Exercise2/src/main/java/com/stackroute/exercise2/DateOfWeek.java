package com.stackroute.exercise2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateOfWeek {
	private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	public String getFirstDateOfWeek(Calendar calendar) {
		while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
			calendar.add(Calendar.DATE, -1);
		}
		return dateFormat.format(calendar.getTime());
	}
	
	public String getLastDateOfWeek(Calendar calendar) {
		while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			calendar.add(Calendar.DATE, 1);
		}
		return dateFormat.format(calendar.getTime());
	}
}
