package com.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class BasicsOfNewDateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("~~~~~~~~~~~~~~~~Creating using now()~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("Date:"+LocalDate.now());
		System.out.println("Time:"+LocalTime.now());
		System.out.println("DateTime:"+LocalDateTime.now());
		System.out.println();
		
		System.out.println("~~~~~~~~~~~~~~~~Creating using of()~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("Date:"+LocalDate.of(2018, 8, 13));
		System.out.println("Time:"+LocalTime.of(13, 0, 0, 0));
		System.out.println("DateTime:"+LocalDateTime.of(2018, 8, 13, 13, 0));
		System.out.println();
		
		System.out.println("~~~~~~~~~~~~~~~~Formatting~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("Rule: Always look at the DateTimeFormatter type. "
				+ "\n If what it expects is not provided to it, it will throw an exception."
				+ "\n 1. ISO_DATE must be provided with date."
				+ "\n 2. ISO_TIME must be provided with time."
				+ "\n 3. ISO_DATE_TIME must be provided with both date and time."
				+ "\n 4. If anything (date/time) is provided, which dtf doesn't need, it will be discarded.");
		System.out.println();
		
		// can use a custom format
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		
		// can use a predefined format
		DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter dtf3 = DateTimeFormatter.ISO_TIME;
		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter dtf5 = DateTimeFormatter.ISO_ZONED_DATE_TIME;
		
		System.out.println("DateTime formatted 1:"+LocalDate.now().format(DateTimeFormatter.ISO_DATE));
		System.out.println("DateTime formatted 1:"+LocalTime.now().format(DateTimeFormatter.ISO_TIME));
		System.out.println("DateTime formatted 1:"+LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
		
		System.out.println("DateTime formatted 2:"+dtf2.format(LocalDate.now()));
		//System.out.println("DateTime formatted 2:"+dtf2.format(LocalTime.now()));
		System.out.println("DateTime formatted 2:"+dtf2.format(LocalDateTime.now()));
		
		//System.out.println("DateTime formatted 3:"+dtf3.format(LocalDate.now()));
		System.out.println("DateTime formatted 3:"+dtf3.format(LocalTime.now()));
		System.out.println("DateTime formatted 3:"+dtf3.format(LocalDateTime.now()));
		
		//System.out.println("DateTime formatted 4:"+dtf4.format(LocalDate.now()));
		//System.out.println("DateTime formatted 4:"+dtf4.format(LocalTime.now()));
		System.out.println("DateTime formatted 4:"+dtf4.format(LocalDateTime.now()));
		
		
		System.out.println();
		
		
		System.out.println("~~~~~~~~~~~~~~~~Parsing~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("The following methods do not throw exception:");
		System.out.println("Parsed Date:"+LocalDate.parse("2018-08-13"));//Uses DateTimeFormatter.ISO_LOCAL_DATE by default
		System.out.println("Parsed Time:"+LocalTime.parse("13:00:00"));//Uses DateTimeFormatter.ISO_LOCAL_TIME by default
		System.out.println("Parsed DateTime 1:"+LocalDateTime.parse("2018-08-13T13:00:00"));//Uses DateTimeFormatter.ISO_LOCAL_DATE_TIME by default
		System.out.println("Parsed DateTime 2:"+LocalDateTime.parse("2018-08-13T13:00:00",DateTimeFormatter.ISO_DATE_TIME));
		
		System.out.println();
	}

}
