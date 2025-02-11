package com.celcom.day6;

public class FinallyExOne {
	public static void main(String[] args) {
		System.out.println("Before Execution");
		try {
			int arr[] = {10,20,30};
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Inside Finally ");
		}
		

		System.out.println("After Execution");
	}

}


	


