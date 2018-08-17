package com.java8.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

	private List<T> stack;
	private final int capacity;
	private int top;

	public Stack(int capacity) {

		this.capacity = capacity;
		this.stack = new ArrayList<T>(capacity);

	}

	public boolean push(T item) throws Exception {

		if (top < capacity) {

			stack.add(++top, item);

		} else {

			new Exception("Stack full!");

		}

		return false;

	}

	public T pop() {

		T item = null;

		if (top == 0) {

			new Exception("Stack empty!");
		} else {
			item = stack.get(top--);
		}
		return item;
	}
}
