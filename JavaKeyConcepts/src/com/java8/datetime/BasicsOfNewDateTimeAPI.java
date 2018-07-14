package com.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class BasicsOfNewDateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Date:"+LocalDate.now());
		System.out.println("Time:"+LocalTime.now());
		System.out.println("DateTime:"+LocalDateTime.now());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		
		System.out.println("DateTime formatted:"+LocalDateTime.now().format(dtf));
	}

}
