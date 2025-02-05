package com.celcom.day2;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		
		int arr[]= {2,5,3,7,6,8,9};
		//sort in ascending
		Arrays.sort(arr);
		for(int index=0;index<arr.length;index++) {
			System.out.print(+arr[index]+" ");
		}
		System.out.println("\nMinimum Value :"+arr[0]);
		System.out.println("Maximum Value :"+arr[arr.length-1]);
		//Descending order
		for(int index=arr.length-1;index>=0;index--) {
			System.out.print(+ arr[index]+" ");
		}
		
	}		


}
