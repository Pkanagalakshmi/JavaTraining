package com.celcom.assignment2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class IterateReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter elements : " );
		for(int i =0;i<n;i++) {
			list.add(sc.nextLine());
		}
		ListIterator<String> iterator = list.listIterator(list.size());
		System.out.println("Reversed Linked List : ");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
sc.close();
}
}
