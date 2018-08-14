package com.java8.concepts;

public class TestClass7_Loops {

	public static void main(String[] args){
		
		crazyLoop();
		
		boolean b1=false;
		
		for(;;){
			System.out.println("Hello");
			break;
		}

	}
	
	
	static void crazyLoop(){
		   int c = 0;
		   JACK: while (c < 8){
		       JILL: System.out.println(c);
	//	       if (c > 3) break JILL; else c++;   //Uncommenting will produce compilation issue
		   }
		}
}
