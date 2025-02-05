package com.celcom.day2;

public class TypesOfVariables {
	int a=20;//instance variable
	static int c=30;//static variable
	public static void main(String[] args) {
		int b =10;//local variable
		System.out.println(b);
		//accesing instance variable
		TypesOfVariables obj =new TypesOfVariables();
		System.out.println(obj.a);
		//accessing static variable
		System.out.println(TypesOfVariables.c);
	}

}
