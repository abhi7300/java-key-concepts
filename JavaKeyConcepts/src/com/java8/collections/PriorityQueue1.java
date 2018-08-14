package com.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		
		PriorityQueue<String> pqString = new PriorityQueue<>();
		
		
		pqString.add("first");
		pqString.add("second");
		pqString.add("third");
		pqString.offer("fourth");
		
		/*System.out.println(pqString.size()+" ");
		System.out.println(pqString.peek()+" ");
		System.out.println(pqString.size()+" ");
		System.out.println(pqString.peek()+" ");
		System.out.println(pqString.size()+" ");
		System.out.println(pqString.poll()+" ");
		System.out.println(pqString.size()+" ");
		System.out.println(pqString.poll()+" ");
		System.out.println(pqString.size()+" ");*/
		
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(5);
		intList.add(4);
		intList.add(6);
		intList.add(40);
		intList.add(8);
		intList.add(1);
		intList.add(7);
		intList.add(2);
		intList.add(10);
		intList.add(4);
		Collections.sort(intList);
		
		System.out.println(intList.toString());
		
	}
}
