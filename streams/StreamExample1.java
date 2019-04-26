package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer result = values.stream().map(e -> e*2).reduce(0, (c,e)->c+e);
		System.out.println(result);
	}
}
