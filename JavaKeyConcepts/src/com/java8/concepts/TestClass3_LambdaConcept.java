package com.java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestClass3_LambdaConcept {
	public static boolean checkList(List list, Predicate<List> p) {
		return p.test(list);
	}

	public static void main(String[] args) {

	//	boolean b = checkList(new ArrayList(), (ArrayList al) -> al.isEmpty()); // WRITE CODE HERE

	//	System.out.println(b);
	}
}
