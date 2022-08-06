package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMapExample {
	
	static Set<String> toUpperTransform(List<Person> listOfPersons) {
		return listOfPersons.stream()
				.map(Person :: getName)
				.map(String :: toUpperCase)
				.collect(Collectors.toSet());
	}
	
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Pineapple");
		List<Integer> fruitLength = fruits.stream()
		.map(String :: length)
		.collect(Collectors.toList());
		System.out.println("Length List: " + fruitLength);
		System.out.println("To uppercase Result: " + toUpperTransform(PersonRepository.getAllPersons()));
		System.out.println("To uppercase Set Result: " + toUpperTransform(PersonRepository.getAllPersons()));
		
		/*
		 * fruits.stream() .map(String :: length) .collect(Collectors.toList())
		 * .forEach(System.out::println);
		 */
	}
}
