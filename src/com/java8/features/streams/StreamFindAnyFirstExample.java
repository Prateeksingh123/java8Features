package com.java8.features.streams;

import java.util.Optional;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamFindAnyFirstExample {
	
	static Predicate<String> p1 = num -> num.length() > 7;
	static Predicate<Person> p2 = per -> per.getHeight() >= 140;
	static Predicate<Person> p3 = per -> per.getGender().equals("Female");
	
	public static void main(String[] args) {
		System.out.println("Find Any Result: " + findAny().get());
		System.out.println("Find First Result: " + findFirst().get());
	}
	
	static Optional<Person> findAny() {
		return PersonRepository.getAllPersons()
		.stream()
		.filter(p2)
		.findAny();
	}
	
	static Optional<Person> findFirst() {
		return PersonRepository.getAllPersons()
		.stream()
		.filter(p3)
		.findFirst();
	}
}
