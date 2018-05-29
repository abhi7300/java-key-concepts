package com.java8.lambda;

public class JavaLambdaTest3 {

	public static void main(String[] args) {
		
		// Runnable using lambdas
        Runnable runnableLambda = ()-> System.out.println("Hi from a runnable lambda!");
        
        runnableLambda.run();
		
	}

}
