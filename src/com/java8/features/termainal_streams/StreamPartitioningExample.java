package com.java8.features.termainal_streams;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamPartitioningExample {
	
	static Predicate<Person> p1 = per -> per.getHeight() >= 140;
	
	static void byHeight() {
		Map<Boolean,List<Person>> map= PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(p1));
		System.out.println("Person Map: " + map);
	}
	
	static void byHeightWith2Param() {
		Map<Boolean,Set<Person>> map= PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(p1,Collectors.toSet()));
		System.out.println("Person Map: " + map);
	}
	
	static void byHeightWithMap() {
//		Map<Boolean,Set<Person>> map= PersonRepository.getAllPersons()
//		.stream()
//		.collect(partitioningBy(p1,Collectors.toSet()));
//		System.out.println("Person Map: " + map);
		
		Map<Boolean,Map<String,List<String>>> map= PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(p1,Collectors.toMap(Person::getName, Person::getHobbies)));
		System.out.println("Person Map: " + map);
	}

	public static void main(String[] args) {
//		byHeight();
//		byHeightWith2Param();
		byHeightWithMap();
	}

}