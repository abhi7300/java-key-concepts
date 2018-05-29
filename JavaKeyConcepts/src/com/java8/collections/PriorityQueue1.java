package com.java8.collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		
		PriorityQueue pq = new PriorityQueue<>();
		
		pq.add("first");
		pq.add("second");
		pq.add("third");
		pq.offer("fourth");
		
		System.out.println(pq.size()+" ");
		System.out.println(pq.peek()+" ");
		System.out.println(pq.size()+" ");
		System.out.println(pq.peek()+" ");
		System.out.println(pq.size()+" ");
		System.out.println(pq.poll()+" ");
		System.out.println(pq.size()+" ");
		System.out.println(pq.poll()+" ");
		System.out.println(pq.size()+" ");
		
	}
}
