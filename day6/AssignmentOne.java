package com.celcom.day6;

import java.util.Scanner;

public class AssignmentOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int[] num= new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();	
		}try {
			for(int i = 0;i<n;i++) {
				for(int j=i;j<n;j++) {
					if(num[i]==num[j]) {
						throw  new Exception();
					}
				}
			}
		}catch(Exception e) {
			System.out.println("duplicate found");
		}
	}

}
