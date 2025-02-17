package com.celcom.assignment2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SearchElement {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		System.out.print("Enter the number of Elements : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter elements : ");
		for(int i =0; i<n;i++) {
			list.add(sc.nextLine());
		}
		System.out.println("Enter element to search : ");
		String SearchElement= sc.nextLine();
		if(list.contains(SearchElement)) {
			System.out.println(SearchElement + " is found in the list");
		}else {
			System.out.println("Invalid Input");
		}
		sc.close();
		
	}

}
