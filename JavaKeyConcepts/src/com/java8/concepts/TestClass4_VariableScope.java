package com.java8.concepts;

public class TestClass4_VariableScope {
	
	//Difference between private variable and instance variable scope
	//Here j is defined twice
	
	private int j; //instance variable

	void showJ() {
		while (j <= 5) {
			for (int j = 1; j <= 5;) {                      //local variable 
				System.out.print(j + " ");
				j++;
			}
			j++;
		}
	}

	public static void main(String[] args) {
		new TestClass4_VariableScope().showJ();
	}
}