package com.java8.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer {
	
	private int cid;
	private String cname;
	
	public Integer getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}

	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
public class ComparatorLambda {

	public static void main(String[] args) {
	
		List<Customer> list1 = new ArrayList<Customer>();
		list1.add(new Customer(41,"Shariful"));
		list1.add(new Customer(92,"Dinesh"));
		list1.add(new Customer(32,"Manish"));
		
		List<Customer> list2 = new ArrayList<Customer>();
		list2.add(new Customer(42,"Rajesh"));
		list2.add(new Customer(93,"Farooq"));
		list2.add(new Customer(34,"Mahesh"));
		
		// annonymous comparator
		Collections.sort(list1, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				
				return o1.getCid().compareTo(o2.getCid());
			}
			
		});
		System.out.println(list1.toString());
		
		// lambda comparator
		Collections.sort(list2, (c1,c2) -> c1.getCid().compareTo(c2.getCid()));
		System.out.println(list2.toString());
	}

}
