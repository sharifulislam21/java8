package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Print All Numbers");
		eval(list, n -> true);

		System.out.println("Print All Even Numbers");
		eval(list, n -> n % 2 == 0);

		System.out.println("Print Numbers Greather than 5");
		eval(list, n -> n > 5);
	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		// Using imperative way
		/*
		 * for(Integer i:list) { if(predicate.test(i)) { System.out.println(i+""); } }
		 */

		// Using lambda exp and forEach()
		list.forEach(i -> {
			if (predicate.test(i)) {
				System.out.println(i + "");
			}
		});
	}
}
