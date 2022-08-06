package com.java8.features.consumer;

import java.util.function.Predicate;

public class PerdicateExample {
	
	public static void main(String[] args) {
		Predicate<Integer> lessThan = a -> (a <= 50);
		Predicate<Integer> greaterThan = a -> (a >= 50);
		Predicate<Integer> equalTo = a -> (a == 0);
		
		/*
		 * boolean result = lessThan.test(15); 
		 * System.out.println("Result: " + result);
		 */
		
		System.out.println("Greater Than: " + greaterThan.test(150));
		System.out.println("Less Than: " + lessThan.test(150));
		System.out.println("Equal: " + equalTo.test(0));
		
//		boolean result = lessThan.and(greaterThan).and(equalTo).test(150);
//		System.out.println("Result: " + result);
		
		/*
		 * boolean result1 = lessThan.or(greaterThan).test(150);
		 * System.out.println("Result: " + result1);
		 */
		
		boolean result2 = lessThan.or(greaterThan).negate().test(150);
		System.out.println("Result: " + result2);
	}

}
