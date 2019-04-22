package com.java8.lambdaexp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLambda {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		// Iterator
		Iterator<String> itr = friends.iterator();
		while(itr.hasNext()) {
			String friend = itr.next();
			System.out.println(friend + "");
		}
		System.out.println(" ");
		
		// enhanced for Loop
		for(String friend:friends) {
			System.out.println(friend+"");
		}
		System.out.println(" ");
		
		// forEach() method added to Iterable in Java 8 and anonymous inner class
		friends.forEach(new Consumer<String>() {

			@Override
			public void accept(String friend) {
				
				System.out.println(friend + "");
			}
			
		});
		
		// forEach() method added to Iterable and Lambda expression Java 8
		friends.forEach(friend -> System.out.println(friend + ""));
		
		// forEach() method added to Iterable, Lambda expression and Method reference in Java 8
		friends.forEach(System.out::println);
		
	}
}
