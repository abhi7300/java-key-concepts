package com.java8.inheritance.subclasses;

import com.java8.inheritance.BaseClass;

public class ChildClass extends BaseClass {

	public int instanceVariable1=7;
	protected static int staticVariable2=54;
	
	public static void main(String[] args){
		
		System.out.println("inherited staticVariable1 :"+staticVariable1);
		System.out.println("inherited baseClassStaticMethod() call: "+baseClassStaticMethod());
		

		ChildClass cc= new ChildClass();
		cc.subClassMethod();
		
		System.out.println("Calling methods on base class instance.");
		BaseClass bc = new BaseClass();
		bc.baseClassNonStaticMethod();
		BaseClass.baseClassStaticMethod();
		
		
	}
	
	private void subClassMethod(){
		System.out.println("super.nonStaticInstanceVariable: "+super.instanceVariable1);
		System.out.println("this.nonStaticInstanceVariable: "+this.instanceVariable1);
		System.out.println("nonStaticInstanceVariable(without super or this): "+ instanceVariable1);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("super.staticVariable2: "+super.staticVariable2);
		System.out.println("this.staticVariable2: "+this.staticVariable2);
		System.out.println("staticVariable2(without super or this): "+ staticVariable2);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		baseClassNonStaticMethod();
		
		baseClassStaticMethod();
	}
	
		public static int baseClassStaticMethod(){
				
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			System.out.println("Inside overriden static method.");
				return 5;
			}
	
	public void baseClassNonStaticMethod(){
		System.out.println("overridden child class method executed. instanceVariable1: "+instanceVariable1);
	}
}
