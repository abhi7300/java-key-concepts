package com.java8.lambda;

import java.util.function.Consumer;

public class JavaLambdaTest {

	public static void main(String[] args) {
		
		// Method References
		// Method references can only be used when using a lambda expression
		// that takes no arguments.
		
		
		//Thread t = new Thread(()->printMessage());
		Thread t = new Thread(JavaLambdaTest::printMessage);
		
		// JavaLambdaTest::printMessage is same as ()->printMessage()  
		// JavaLambdaTest -- static
		t.start();
		
		
		//printText("(p)->method(p) using Method References", p->System.out.println(p));
		printText("(p)->method(p) using Method References", System.out::println);
		
		// System.out::println is same as p->System.out.println(p)    
		// System.out -- not static
		
		
		// invoking the forEach method on a collection is the perfect 
		// opportunity of using lambda expressions.
		
	}
	
	

	private static void printMessage() {
		System.out.println("This is an example of method reference.");
	}
	
	private static void printText(String text, Consumer<String> consumer) {
		consumer.accept(text);
	}

}
