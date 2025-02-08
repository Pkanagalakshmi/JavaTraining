package com.celcom.day3;

public class ThisKeywordTwo {
	ThisKeywordTwo(){
		this("kanaga");
		System.out.println("a");
	}
	ThisKeywordTwo(String name){
		this(100);
		System.out.println("b");

		
	}
	ThisKeywordTwo(int num){
		System.out.println("c");

		
	}
	public static void main(String[] args) {
		ThisKeywordTwo calling =new ThisKeywordTwo();
	}

}
