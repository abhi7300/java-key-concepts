package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

import com.java8.lambda.dto.Person;

public class JavaLambdaTest7 {

	public static void main(String[] args) {

		// Streams in the context of lambda expressions.
		
		List<Person> people = Arrays.asList(

				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Arnold", 39));

		// think of stream as a sequential supply of items on a conveyer belt. 
		
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.toString()));
		
		
		// Returns a possibly parallel Stream with this collection 
		// as its source. It is allowable for this method to return a sequential stream. 
		long count = people.parallelStream()
		.filter(p->p.getLastName().startsWith("C"))
		.count();
		System.out.println(count);
		
		
	}



}

