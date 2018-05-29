package com.java8.lambda;

import com.java8.lambda.taskinterface.Task;

public class JavaLambdaTest1 {
	

	
	public static void main(String[] args){
		
		// 1. The type of a lambda expression is always an interface.
		// 2. A lambda expression represents a behavior.
		// 3. This is one of the simplest examples of a lambda expression.
		// 4. The interface used as the type of any lambda expression 
		//    can have only one method.
		// 5. Please read the text written in interface Task to understand
		//    what are Functional Interfaces.
		
		
		Task task = ()-> System.out.println("Hello from Lambda!");
		
		Task taskInnerClass = new Task(){

			@Override
			public void perform() {
				System.out.println("Hello from inner class!");
			}
			
		};
		
		task.perform();
		
		taskInnerClass.perform();
		
		// even though the two approaches are doing the same task. They are not same.
		
		
	}
}
