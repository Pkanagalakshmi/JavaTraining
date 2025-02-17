package com.celcom.assignment2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyArrayList {
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
		System.out.println("Orginal list : "+list);
		List<String> list1 = new ArrayList<>();
		for(String s :list) {
			list1.add(new String(s));
		}
		System.out.println("copied list : "+list1);
		System.out.println(list.hashCode());
		System.out.println(list1.hashCode());
		
	}
	

}
