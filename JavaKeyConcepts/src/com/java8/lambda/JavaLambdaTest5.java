package com.java8.lambda;

import java.util.function.Consumer;

public class JavaLambdaTest5 {

	public static void main(String[] args) {

		// Exception Handling while using lambda expressions.
		// In this example, the exception handling code has been 
		// put in a separate method. There are no special features
		// provided by java 8 to handle exceptions while working with 
		// lambda expressions.

		int[] numbers = { 2, 4, 6, 8 };
		// Integer key = 2;
		Integer key = 0;

		performTask(numbers, wrapper((p) -> System.out.println(p / key)));

	}

	private static void performTask(int[] numbers, Consumer<Integer> consumer) {

		for (int num : numbers) {
			consumer.accept(num);
		}
	}

	private static Consumer<Integer> wrapper(Consumer<Integer> consumer) {

		return (p) -> {
			try {
				consumer.accept(p);
			} catch (Exception e) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}

}
