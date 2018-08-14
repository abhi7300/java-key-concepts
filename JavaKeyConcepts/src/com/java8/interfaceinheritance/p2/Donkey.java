package com.java8.interfaceinheritance.p2;

import com.java8.interfaceinheritance.p1.Movable;
import com.java8.interfaceinheritance.p1.Movable2;

public class Donkey implements Movable,Movable2 {
	int location = 200;

	public void move(int by) {
		location = location + by;
	}

	public void moveBack(int by) {
		location = location - by;
	}
}
