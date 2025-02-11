package com.celcom.day6;

import java.util.Scanner;

public class AssignmentTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine().toLowerCase();	
		
		try {
			if(!input.matches(".*[a,e,i,o,u]*.") ) {
				throw new Exception();
			}else {
				System.out.println("Vowels found");
			}
		}
		catch(Exception e){
			System.out.println("Vowels not found");

		}
	}
	

}
