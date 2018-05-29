package com.java8.concepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendar1 {
	
	//Java Date and Time by DOSHI

	public static String getDay(String day, String month, String year) {


		
		Date dateParsed = new Date(); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			// cal.setTime(sdf.parse(day+"/"+month+"/"+year));
			dateParsed = sdf.parse(day+"/"+month+"/"+year);
			System.out.println("datePArsed: "+dateParsed);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
		System.out.println(sdf2.format(dateParsed).toUpperCase());
		
		
		return "INCORRECT INPUT";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));

	}

}
