package com.java8.lambda;

public class JavaLambdaTest2 {

	public static void main(String[] args) {


		// An example of type inference
		
		//This is right
		StringLengthLambda strLenLambda1 = (String s)-> s.length();
		
		StringLengthLambda strLenLambda2 =  s-> s.length();  
		// no need to pass the type as 
		// it can be inferred by the compiler 
		// from the interface method

		System.out.println(strLenLambda1.getLength("ABCD"));
		
		System.out.println(strLenLambda2.getLength("ABCDE"));
		
	}

	interface StringLengthLambda {

		int getLength(String s);
	}

}
