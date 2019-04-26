package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dinesh","Mahesh","Manish","Avinash","Shariful");
		List<String> upperCaseNames = new ArrayList<String>();
		
		//conventional way
		for(String name:names) {
			upperCaseNames.add(name.toUpperCase());
		}
		System.out.println(upperCaseNames);
		upperCaseNames.clear();

		//lambda expression
		names.forEach( name -> upperCaseNames.add(name.toUpperCase()));
		System.out.println(upperCaseNames);
		upperCaseNames.clear();
		
		//lambda expression with streams
		names.stream().map(name -> name.toUpperCase()).forEach(name -> upperCaseNames.add(name));
		System.out.println(upperCaseNames);
		upperCaseNames.clear();
	}

}
