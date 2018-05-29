package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.lambda.dto.Person;

public class JavaLambdaTest4 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Arnold", 39));

		// Step 1: Sort list by last name

		// Step 2: Create a method that prints all elements in the list

		// Step 3: Create a method that prints all people that have their last
		// name beginning with C

		java7Approach(people);

		java8Approach(people);
	}

	private static void java7Approach(List<Person> people) {
		// Step 1: Sort list by last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}

		});

		// Step 2: Create a method that prints all elements in the list

		for (Person p : people) {
			System.out.println(p.toString());
		}

		// Step 3: Create a method that prints all people that have their last
		// name beginning with C
		Condition startsWithCcondition = new Condition() {

			@Override
			public boolean test(Person p) {
				if (p.getLastName().startsWith("C")) {
					return true;
				}
				return false;
			}

		};
		printConditionally(people, startsWithCcondition);

	}
	
	

	private static void java8Approach(List<Person> people) {

		// Step 1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		// Step 2: Create a method that prints all elements in the list
		people.forEach(p -> System.out.println(p.toString()));

		// Step 3: Create a method that prints all people that have their last
		// name beginning with C
		people.forEach(p -> {if(p.getLastName().startsWith("C")){System.out.println(p.toString());}});

	}

	
	
	
	static void printConditionally(List<Person> people, Condition condition) {

		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p.toString());
			}
		}

	}

}

interface Condition {
	boolean test(Person p);
}