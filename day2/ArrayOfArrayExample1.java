package com.celcom.day2;

public class ArrayOfArrayExample1 {
public static void main(String[] args) {
	//syntax 1 of array 
	int arr[][]= {{1,2,3},{2,3,4,7},{3,4,5,7,9}};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
