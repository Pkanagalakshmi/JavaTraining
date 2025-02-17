package com.celcom.assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ReverseList {
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
	System.out.println("Orginal list : "+ list );
	Collections.reverse(list);
	System.out.println("Reverse list : "+ list);

}
}
