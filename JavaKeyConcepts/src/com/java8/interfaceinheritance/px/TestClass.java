package com.java8.interfaceinheritance.px;

import com.java8.interfaceinheritance.p1.Movable;
import com.java8.interfaceinheritance.p2.Donkey;

public class TestClass {
	
	// inheriting variable with same name and a method with same name and arguments
	// from the interfaces Movable and Movable 2 in Donkey
	
	public static void main(String[] args) {
		Movable m = new Donkey();
		m.move(10);
		m.moveBack(20);
		System.out.println(m.location);
	}
}
