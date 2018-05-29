package com.java8.lambda;

public class JavaLambdaTest6 {

	public static void main(String[] args) {

		// Closures in lambda

		int a = 10;
		int b = 20;

		// here as the variable b is being used as part of lambda expression,
		// its value cannot be changed anymore. If a piece of code tries to 
		// change the value of b after b is declared and before b is used 
		// in the lambda, then compiler will throw an error.
		
		performTask(a, p -> System.out.println(p + b));

		//this happened in java 7 as well with anonymous inner classes
		performTask(a, new Process(){

			@Override
			public void process(int a) {
				// Changing the value of b will throw compiler error.
				// b = 30; //throws compiler error
				System.out.println(a+b);
				
			}
			
		});
		
	}

	private static void performTask(int a, Process process) {

		process.process(a);

	}

}

interface Process {

	void process(int a);
}
