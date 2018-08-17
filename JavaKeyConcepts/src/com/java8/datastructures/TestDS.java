package com.java8.datastructures;

public class TestDS {

	public static void main(String[] args) throws Exception {

		Stack<Integer> stack = new Stack<Integer>(5);

		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}

		for (;;) {
			stack.pop();
		}
	}

}
