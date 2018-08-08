package com.java8.inheritance;

public class BaseClass {

	
	protected static int staticVariable1=2;
	protected static int staticVariable2=3;
	
	public  int instanceVariable1 =6; 
	
	public static int baseClassStaticMethod(){
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Inside base class static method.");
		return 5;
	}
	
	
	public void baseClassNonStaticMethod(){
		System.out.println("base class method executed. instanceVariable1: "+instanceVariable1);
	}
}
