package com.java8.concepts;

public class TestClass8_Boolean {

	public static void main(String[] args) {

		/*
		 * When you use the equality operator ( == ) with booleans, if
		 * exactly one of the operands is a Boolean wrapper, it is first unboxed
		 * into a boolean primitive and then the two are compared (JLS 15.21.2).
		 * If both are Boolean wrappers, then their references are compared just
		 * like in the case of other objects. Thus, new Boolean("true") == new
		 * Boolean("true") is false, but new Boolean("true") ==
		 * Boolean.parseBoolean("true") is true.
		 */

	}

}
