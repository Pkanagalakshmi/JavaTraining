package com.celcom.day2;

public class ArrayExampleOne {
	public static void main(String[] args) {
		//syntax 1
		int arr[]= {10,20,30,40};
		int sum=0;
		System.out.println("Array Length :"+arr.length);
		System.out.println("Array Elements :");
		//for loop
		for(int index=0;index<arr.length;index++) {
			sum+=arr[index];
			System.out.println(arr[index]);
		}
		System.out.println("Total sum :"+sum);
		//for each loop
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
