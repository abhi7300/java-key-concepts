package com.java8.concepts;

public class TestClass6_IfConstruct {
	
	//What happens when the above program is run with the command line : java TestClass6_IfConstruct closed
	
	public static void main(String[] args) {
		if (args[0].equals("open"))
			if (args[1].equals("someone"))
				System.out.println("Hello!");
			else
				System.out.println("Go away " + args[1]);
	}
}
