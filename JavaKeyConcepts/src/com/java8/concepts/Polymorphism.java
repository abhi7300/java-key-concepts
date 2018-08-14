package com.java8.concepts;

import com.java8.inheritance.BaseClass;
import com.java8.inheritance.subclasses.ChildClass;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseClass sc = new ChildClass();
		
        // Interview Question
		// This will throw a runtime exception although it compiles
		ChildClass subC = (ChildClass) new BaseClass();  
		
		
		
	}

}
