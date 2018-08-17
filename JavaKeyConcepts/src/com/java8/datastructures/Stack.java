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

			stack.add(top, item);
			top++;

		} else {

			throw new Exception("Stack full!");

		}

		return false;

	}

	public T pop() throws Exception {

		T item = null;

		if (stack.size() == 0) {

			throw new Exception("Stack empty!");

		} else {
			item = stack.remove(--top);
		}
		return item;
	}
}
