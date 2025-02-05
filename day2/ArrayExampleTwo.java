package com.celcom.day2;

import java.util.Scanner;

public class ArrayExampleTwo {
	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		int evenCount=0;
		int oddCount=0;
		System.out.println("intial values");
		for(int values:arr) {
			System.out.println(arr[values]);
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter five values");
		for(int index =0; index<arr.length;index++) {
			arr[index]=sc.nextInt();
		}
		for(int index =0;index<arr.length;index++) {
			sum=sum+arr[index];
			if (arr[index]%2==0) {
				evenCount++;
				
			}else {
				oddCount++;
			}
		}System.out.println(sum);
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
	

}
