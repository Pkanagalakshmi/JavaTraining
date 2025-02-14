package com.celcom.day9;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add("Java");
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(0));
		list.add(1, 15);
		System.out.println(list);
		list.set(1, 150);
		System.out.println(list);
		list.remove(new Integer(10));
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list.size());
		System.out.println(list.contains(20));
		//way-1
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//way 2
		System.out.println("space");
		for(Object i: list) {
			System.out.println(i);
		}
		System.err.println("space");

		//way 3
		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
