package com.java8.methodref;

public class MethodRefTest3 {

	MethodRefTest3() {
		System.out.println("Inside MethodRefTest3 constructor.");
	}

	// Using method reference to refer to constructor

	public static void main(String[] args) {

		Task2 task2 = MethodRefTest3::new;

		task2.perform();

	}

}

interface Task2 {
	void perform();
}