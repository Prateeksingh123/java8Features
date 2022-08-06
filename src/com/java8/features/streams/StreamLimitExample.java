package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Orange", "Grapes", "Banana", "Pineapple");
		fruits.stream().limit(2).forEach(System.out::println);
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
		int sum = integers.stream()
		.limit(2)
		.reduce(0,(a,b) -> (a+b));
		System.out.println("Sum of Limit: " + sum);
		
		int skipSum = integers.stream()
				.skip(2)
				.reduce(0,(a,b) -> (a+b));
		System.out.println("Sum of Skip: " + skipSum);
	}

}
