package com.java8.features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingUnboxingExample {

	static List<Integer> boxingMethod() {
		return IntStream.rangeClosed(1, 40) // primitive int
				.boxed() // coverting to wrapper Integer
				.collect(Collectors.toList()); // collect as List
	}
	
	static int calculateSum(List<Integer> list) {
		return list.stream()
				.mapToInt(Integer :: intValue) // Map do the 
				.sum();
	}
	
	public static void main(String[] args) {
		boxingMethod().forEach(System.out::println);
		
		System.out.println("Sum is: " + calculateSum(boxingMethod()));
	}

}
