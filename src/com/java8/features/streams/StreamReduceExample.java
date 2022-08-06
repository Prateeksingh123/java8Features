package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
	
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5);
		int sum = listOfIntegers.stream().mapToInt(i -> i).sum();
		System.out.println("Sum Result: " + sum);
		
		long count = listOfIntegers.stream().mapToInt(i -> i).count();
		System.out.println(count);
		
		System.out.println("Result of Multiplication: " + listOfIntegers.stream().reduce(1, (a,b) -> a*b));
		System.out.println("Result of Multiplication: " + listOfIntegers.stream().reduce(0, (a,b) -> a+b));
	}

}
