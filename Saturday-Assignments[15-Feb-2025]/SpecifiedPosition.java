package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ListIterator;

public class SpecifiedPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter elements : " );
		for(int i =0;i<n;i++) {
			list.add(sc.nextLine());
			
		}
		System.out.println("Enter the starting Position : ");
		int startPosition = sc.nextInt();
		sc.nextLine();
		ListIterator<String> iterator = list.listIterator(startPosition);
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
			
			
		}

}
}