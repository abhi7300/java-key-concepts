package com.java8.methodref;

public class MethodRefTest1 {

	
	// Using method references to refer to static methods.
	
	public static void main(String[] args) {

		Sayable say = MethodRefTest1::saySomething;
		say.say();
	}

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

}

interface Sayable {
	void say();
}