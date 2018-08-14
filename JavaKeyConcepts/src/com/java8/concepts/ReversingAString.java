package com.java8.concepts;

public class ReversingAString {

	public static void main(String[] args) {

		
		//There is no reverse method in String class.
		String name = "Abhishek";
		StringBuilder sb = new StringBuilder(name);
		name = sb.reverse().toString();
		System.out.println("Reversed String: " + name);

		
		
	}

}
