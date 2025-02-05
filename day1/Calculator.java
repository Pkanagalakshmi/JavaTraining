package com.celcom.day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 :");
		int num1=sc.nextInt();
		System.out.print("Enter Number 2 :");
		int num2=sc.nextInt();
		System.out.print("Enter choice:\n1.Addition \n 2.subtraction \n 3.division \n 4. multiplication");
		String choice =sc.next();
		int result =0;
		switch(choice) {
		case "Addition":
			result =num1+num2;
			break;
		case "subtraction":
			result =num1-num2;
			break;
		case "division":
			result =num1/num2;
			break;
		case "multiplication":
			result= num1*num2;
			break;
		default:
			System.out.println("invaild number");
			

		}
		
		System.out.println(result);
		

	}

}
