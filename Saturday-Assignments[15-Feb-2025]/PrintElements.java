package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintElements {
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
	
	for(int i = 0; i<list.size();i++) {
		System.out.println("index"+i+":"+list.get(i));
	}
	sc.close();

}
}
