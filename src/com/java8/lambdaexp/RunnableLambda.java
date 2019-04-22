package com.java8.lambdaexp;

public class RunnableLambda {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi! Runnable!");
				
			}
		};
		
		//lambda expression
		Runnable r2 = () -> System.out.println("Hello! RunnableLambda!");
		
		new Thread(r1).start();
		new Thread(r2).start();
	}
}
