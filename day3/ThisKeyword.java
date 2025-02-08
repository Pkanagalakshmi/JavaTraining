package com.celcom.day3;

public class ThisKeyword {
	String name;
	ThisKeyword(){
		this("kanaga");
	}
	ThisKeyword(String name){
		this.name=name;
		greeting();
	}
	 void greeting() {
		 System.out.println("Welcome "+name);
		
	}
public static void main(String[] args) {
	ThisKeyword greet =new ThisKeyword("kanaga");
	
	
}
}
