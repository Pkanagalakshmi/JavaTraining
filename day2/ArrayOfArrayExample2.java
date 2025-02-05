package com.celcom.day2;


public class ArrayOfArrayExample2 {
	
public static void main(String[] args) {
	//array declaration for i(outerloop given 3)(j innerloop can give any size)
	int arr[][]=new int[3][];
	arr[0]=new int[] {1,2,3};
	arr[1]=new int[] {1,2,3,4};
	arr[2]=new int[] {1,2,3,4,5};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		
	}

	
}
	
	


}
