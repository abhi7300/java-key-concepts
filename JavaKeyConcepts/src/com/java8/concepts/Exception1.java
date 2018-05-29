package com.java8.concepts;

import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) {

		System.out.println("Returned value:" + testException());

	}

	private static String testException() {

		try {

			System.out.println("Throwing");
			throw new IOException();

		} catch (Exception e) {

			System.out.println("Exception caught: " + e.getMessage());
			return "caught";

		} finally {

			System.out.println("In finally");
			return "finally";
		}

	}

}
