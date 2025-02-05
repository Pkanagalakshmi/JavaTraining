package com.celcom.day2;

public class TypesOfMethods {
	void m1() {
		System.out.println("Instance Method");
	}
	static void m2() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		
		TypesOfMethods obj =new TypesOfMethods();
		obj.m1();//Instance Method
		TypesOfMethods.m2();
		
	
	}

}
