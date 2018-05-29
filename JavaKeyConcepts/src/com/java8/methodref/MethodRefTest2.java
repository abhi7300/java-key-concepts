package com.java8.methodref;

public class MethodRefTest2 {
	
	// Using method reference to refer to instance methods

	public static void main(String[] args) {

		MethodRefTest2 methodRef2 = new MethodRefTest2();
		
		// referring to instance methods of a particular type
		Task task = methodRef2::saySomething;
		
		task.perform();
		
		
		// referring to instance methods using anonymous objects 
		// (arbitrary objects of a particular type) 
		Task task2 = new MethodRefTest2()::saySomethingMore;

		task2.perform();
		
	}

	
	public void saySomething() {
		System.out.println("Hello, this is an instance method.");
	}
	
	public void saySomethingMore() {
		System.out.println("Hello, this is the second instance method.");
	}
}


interface Task {
	void perform();
}